package tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;
import static org.testng.Assert.assertEquals;

public class SingleUserNotFound extends BaseTest {

    @Test
    public void tesSingleUserNotFound() {

        Response response =
                when()
                        .get("https://reqres.in/api/users/23")
                        .then()
                        .log().all()
                        .statusCode(404)
                        .contentType(ContentType.JSON).extract().response();

    }
}