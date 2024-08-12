import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetUserInfo {
    @Test
    public void GetUserInfoTC()
    {
        //Specify the base URL for API
        RestAssured.baseURI="https://jsonplaceholder.typicode.com";
        //send get request to User 1 endpoint and receive response then validate Response
        Response response=
                RestAssured.given()
                .get("/users/1").then()
                        .extract().response();
    
        // Verify the response status code

        response.getBody().print();
        Assert.assertEquals(response.getStatusCode(),200);
        // Verify the response body contains the expected user information
        String userName = response.jsonPath().getString("name");
        Assert.assertEquals(userName, "Leanne Graham");

        String userEmail = response.jsonPath().getString("email");
        Assert.assertEquals(userEmail, "Sincere@april.biz");


    }
}
