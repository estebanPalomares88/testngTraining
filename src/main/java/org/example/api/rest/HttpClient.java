package org.example.api.rest;

import io.github.cdimascio.dotenv.Dotenv;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class HttpClient {
    static Dotenv env = Dotenv.load();
    static String baseUri = env.get("API_URL");

    public static Response getMethod(String endPoint,Object payload) {
        RequestSpecification requestSpecification = given()
                .baseUri(baseUri)
                .basePath(endPoint)
                .body(payload, ObjectMapperType.GSON)
                .accept(ContentType.JSON);

        return requestSpecification.when().get();
    }
    public static Response getMethod(String endPoint) {
        RequestSpecification requestSpecification = given()
                .baseUri(baseUri)
                .basePath(endPoint)
                .accept(ContentType.JSON);

        return requestSpecification.when().get();
    }

    public static Response getMethodWithToken(String token) {
        RequestSpecification requestSpecification = given()
                .baseUri(baseUri)
                .basePath("bearer")
                .accept(ContentType.JSON)
                .header("Authorization", "Bearer " + token);

        return requestSpecification.when().get();
    }

    public static Response postMethod(String endPoint,Object payload) {
        RequestSpecification requestSpecification = given()
                .baseUri(baseUri)
                .basePath(endPoint)
                .body(payload, ObjectMapperType.GSON)
                .accept(ContentType.JSON);

        return requestSpecification.when().post();
    }

    public static Response postMethod(String endPoint) {
        RequestSpecification requestSpecification = given()
                .baseUri(baseUri)
                .basePath(endPoint)
                .accept(ContentType.JSON);

        return requestSpecification.when().post();
    }

    public static Response putMethod(String endPoint,Object payload) {
        RequestSpecification requestSpecification = given()
                .baseUri(baseUri)
                .basePath(endPoint)
                .body(payload, ObjectMapperType.GSON)
                .accept(ContentType.JSON);

        return requestSpecification.when().put();
    }

    public static Response putMethod(String endPoint) {
        RequestSpecification requestSpecification = given()
                .baseUri(baseUri)
                .basePath(endPoint)
                .accept(ContentType.JSON);

        return requestSpecification.when().put();
    }

    public static Response patchMethod(String endPoint,Object payload) {
        RequestSpecification requestSpecification = given()
                .baseUri(baseUri)
                .basePath(endPoint)
                .body(payload, ObjectMapperType.GSON)
                .accept(ContentType.JSON);

        return requestSpecification.when().patch();
    }
    public static Response patchMethod(String endPoint) {
        RequestSpecification requestSpecification = given()
                .baseUri(baseUri)
                .basePath(endPoint)
                .accept(ContentType.JSON);

        return requestSpecification.when().patch();
    }

    public static Response deleteMethod(String endPoint,Object payload) {
        RequestSpecification requestSpecification = given()
                .baseUri(baseUri)
                .basePath(endPoint)
                .body(payload, ObjectMapperType.GSON)
                .accept(ContentType.JSON);

        return requestSpecification.when().delete();
    }

    public static Response deleteMethod(String endPoint) {
        RequestSpecification requestSpecification = given()
                .baseUri(baseUri)
                .basePath(endPoint)
                .accept(ContentType.JSON);

        return requestSpecification.when().delete();
    }
}
