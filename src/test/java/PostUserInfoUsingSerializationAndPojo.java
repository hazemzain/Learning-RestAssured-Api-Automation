import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostUserInfoUsingSerializationAndPojo {
    @Test
    public void PostUserUsingSerializationInfoTC() throws JsonProcessingException {

        //Specify the base URL for API
        RestAssured.baseURI="https://jsonplaceholder.typicode.com";
        // Creating Request Body:
        AddressDetails Address=new AddressDetails("SeaRoad","Tanta","123456");
        UsersData UserInfo=new UsersData("Hazem","hazemzain1999@gmail.com",Address);
        //The ObjectMapper from the Jackson library serializes the UsersData object into a JSON string.
        ObjectMapper ObjectMapperUser=new ObjectMapper();
        String RequestBody=ObjectMapperUser.writerWithDefaultPrettyPrinter().writeValueAsString(UserInfo);
        //send Post request to User 1 endpoint and receive response then validate Response
        //The request includes a JSON body and a Content-Type header.
        Response response=
                RestAssured.given().header("Content-Type", "application/json")
                        .body(RequestBody).post("/users").then().extract().response();
        // Verify the response status code
        response.getBody().print();
        Assert.assertEquals(response.getStatusCode(), 201);
        Assert.assertEquals(response.jsonPath().getString("name"),"Hazem");



    }
}
