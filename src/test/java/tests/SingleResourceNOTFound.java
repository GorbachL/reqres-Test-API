package tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;

public class SingleResourceNOTFound extends BaseTest {

    @Test
    public void testSingleResourceNotFound() {

        Response response =
                when()
                        .get("https://reqres.in/api/unknown/23")
                        .then()
                        .log().all()
                        .statusCode(404)
                        .contentType(ContentType.JSON).extract().response();
    }
}
