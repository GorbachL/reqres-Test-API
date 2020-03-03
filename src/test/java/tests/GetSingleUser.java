package tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;
import static org.testng.Assert.assertEquals;

public class GetSingleUser extends BaseTest {

    @Test
    public void getSingleUser() {
        String expected = "{\"data\":{\"id\":2,\"email\":\"janet.weaver@reqres.in\",\"first_name\":\"Janet\",\"last_name\":\"Weaver\",\"avatar\":\"https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg\"}}";
        Response response =
                when()
                        .get("https://reqres.in/api/users/2")
                        .then()
                        .log().all()
                        .statusCode(200)
                        //.body("data.first_name", equalTo("Janet"));
                        .contentType(ContentType.JSON).extract().response();
        //System.out.println(response.asString());
        assertEquals(expected, response.asString().trim());
    }
}
