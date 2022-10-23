import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase {

    @Test
    void test1(){

        //get request dulu dari url
        Response url1 = RestAssured.get("https://reqres.in/api/users?page=2");

        //show responsnya
        System.out.println("Response: "+url1.asString());
        System.out.println("Status code: "+url1.getStatusCode());
        System.out.println("Body: "+url1.getBody().asString());
        System.out.println("Time taken: "+url1.getTime());
        System.out.println("Header: "+url1.getHeader("content-type"));

        //expectednya
        int statusCode = url1.getStatusCode();
        Assert.assertEquals(statusCode, 200);

    }
}
