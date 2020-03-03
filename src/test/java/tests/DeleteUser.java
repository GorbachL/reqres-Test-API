package tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;


public class DeleteUser extends BaseTest {

    @Test
    public void deleteUser() {

        ValidatableResponse response =
                when()
                        .delete("https://reqres.in/api/users/2")
                        .then()
                        .log().all()
                        .statusCode(204);
    }
}
