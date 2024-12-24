package by.mi.api;

import by.mi.domain.User;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static io.restassured.RestAssured.given;

public class LoginRequest {

    private static final Logger logger = LogManager.getLogger();

    public static RequestSpecification requestSpecification;

    public static void initRequestSpecification() {

        logger.info("LoginRequest - initRequestSpecification().");

        requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://mi.by")
                .setBasePath("/bitrix/services/main/ajax.php?mode=ajax&c=mi%3Aauthorization&action=login")
                .setContentType("application/x-www-form-urlencoded")
                .build();
    }

    public ValidatableResponse getResponseForRequest(User user) {

        logger.info("LoginRequest - getResponseForRequest().");

        ValidatableResponse response = given()
                .spec(requestSpecification)
                .body(getBody(user))
                .when()
                .post()
                .then();
        return response;
    }

    public ValidatableResponse getResponseForRequest(String email, String password) {

        logger.info("LoginRequest - getResponseForRequest():{}email, {}password", email, password);

        ValidatableResponse response = given()
                .spec(requestSpecification)
                .body(getBody(email, password))
                .when()
                .post()
                .then();
        return response;
    }

    public static String getBody(String email, String password) {
        return "login=" + email + "&password=" + password;
    }

    public static String getBody(User user) {
        return getBody(user.getEmail(), user.getPassword());
    }
}
