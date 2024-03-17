import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;


public class helloWorldTest {

    @Test
    public void testRestAssured(){
        /*Map<String, Object> body = new HashMap<>();
        body.put("param1", "value1");
        body.put("param2", "value2");*/

        Response response = RestAssured
                .given()
                .redirects()
                .follow(true)
                .when()
                .get("https://playground.learnqa.ru/api/get_303")
                .andReturn();

        int statuscode = response.statusCode();
        System.out.println(statuscode);

    }

}
