import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateUserInfo {
    @Test
    public void UpdateUserInfoTC()
    {

        //Specify the base URL for API
        RestAssured.baseURI="https://jsonplaceholder.typicode.com";
        // Define the request body
        String requestBody = "{\"name\":\"hazem\",\"job\":\"Software Testing Engineer\"}";

        //send put request to User 1 endpoint to update it  and receive response then validate Response
        Response response=
                RestAssured.given().header("Content-Type", "application/json")
                        .body(requestBody).put("/users/1").then().extract().response();
        // Verify the response status code
        response.getBody().print();
        Assert.assertEquals(response.jsonPath().getString("name"),"hazem");



    }
}
