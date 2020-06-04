package adapters;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.ResourceList;

import org.apache.http.protocol.HTTP;

import static io.restassured.RestAssured.given;

public class ResourcesAdapter extends MainAdapter {

    public ResourceList get() {

        Response response =
                given()
                        .header(HTTP.CONTENT_TYPE, ContentType.JSON)
                        .log().all()
                        .when()
                        .get("https://reqres.in/api/unknown")
                        .then()
                        .log().all()
                        .statusCode(200)
                        .contentType(ContentType.JSON).extract().response();

        return gson.fromJson(response.asString().trim(), ResourceList.class);

    }
}
