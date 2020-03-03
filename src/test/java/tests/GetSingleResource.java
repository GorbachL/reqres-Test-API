package tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;
import static org.testng.Assert.assertEquals;

public class GetSingleResource extends BaseTest {

    @Test
    public void getSingleResource() {
        String expectedResource = "{\"data\":{\"id\":2,\"name\":\"fuchsia rose\",\"year\":2001,\"color\":\"#C74375\",\"pantone_value\":\"17-2031\"}}";
        Response response =
                when()
                        .get("https://reqres.in/api/unknown/2")
                        .then()
                        .log().all()
                        .statusCode(200)
                        .contentType(ContentType.JSON).extract().response();

        System.out.println(response.asString());
        assertEquals(expectedResource, response.asString().trim());
    }
}

