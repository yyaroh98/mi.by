package by.mi.api;

import by.mi.domain.Users;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginApiTest {

    @BeforeEach
    void setUp() {
        LoginRequest.initRequestSpecification();
    }

    @Test
    @DisplayName("Авторизация с неверным email и password")
    public void testWithIncorrectEmailAndPassword() {

        given()
                .spec(LoginRequest.requestSpecification)
                .body(LoginRequest.getBody(Users.getUserWithIncorrectEmailAndPassword()))
                .when()
                .post()
                .then()
                .log().all()
                .statusCode(200)
                .body("status", equalTo("error"))
                .body("data", equalTo(null))
                .body("message", equalTo("Неверный логин или пароль.<br>"));
    }

    @Test
    @DisplayName("Авторизация с верным email и password")
    public void testWithCorrectEmailAndPassword() {
        String email = "yaroshzhenya_98@mail.ru";
        String password = "c412f1809";

        given()
                .spec(LoginRequest.requestSpecification)
                .body(LoginRequest.getBody("email", "password"))
                .when()
                .post()
                .then()
                .log().all()
                .statusCode(200);
        //   .body("data", equalTo("true"));
    }

    @Test
    @DisplayName("Авторизация с пустыми значениями email и password")
    public void testWithEmptyEmailAndPassword() {

        given()
                .spec(LoginRequest.requestSpecification)
                .body(LoginRequest.getBody(Users.getUserWithEmptyEmailAndPassword()))
                .when()
                .post()
                .then()
                .log().all()
                .statusCode(200)
                .body("status", equalTo("error"))
                .body("data", equalTo(null));
    }
}

