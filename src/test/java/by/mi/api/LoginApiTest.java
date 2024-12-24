package by.mi.api;

import by.mi.domain.Users;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class LoginApiTest {

    private static final Logger logger = LogManager.getLogger();
    private LoginRequest loginRequest;

    @BeforeEach
    void setUpLoginApiTest() {
        LoginRequest.initRequestSpecification();
        loginRequest = new LoginRequest();
    }

    @Test
    @DisplayName("Авторизация с неверным email и password")
    public void testWithIncorrectEmailAndPassword() {

        logger.info("Начало - testWithIncorrectEmailAndPassword(). Авторизация с неверным email и password.");

        loginRequest.getResponseForRequest(Users.getUserWithIncorrectEmailAndPassword())
                .log().all()
                .statusCode(200)
                .body("status", equalTo("error"))
                .body("data", equalTo(null));
        //   .body("message", equalTo(ApiMessage.INCORRECT_EMAIL_AND_PASSWORD_MESSAGE));

        logger.info("Конец - testWithIncorrectEmailAndPassword(). Авторизация с неверным email и password.");
    }


    @Test
    @DisplayName("Авторизация с верным email и password")
    public void testWithCorrectEmailAndPassword() {
        logger.info("Начало - testWithCorrectEmailAndPassword(). Авторизация с верным email и password.");

        String email = "yaroshzhenya_98@mail.ru";
        String password = "c412f1809";

        loginRequest.getResponseForRequest(email, password)
                .log().all()
                .statusCode(200);
        //   .body("data", equalTo("true"));

        logger.info("Конец - testWithCorrectEmailAndPassword(). Авторизация с верным email и password.");
    }

    @Test
    @DisplayName("Авторизация с пустыми значениями email и password")
    public void testWithEmptyEmailAndPassword() {

        logger.info("Начало - testWithEmptyEmailAndPassword(). Авторизация с пустыми значениями email и password.");

        loginRequest.getResponseForRequest(Users.getUserWithEmptyEmailAndPassword())
                .log().all()
                .statusCode(200)
                .body("status", equalTo("error"))
                .body("data", equalTo(null));

        logger.info("Конец - testWithEmptyEmailAndPassword(). Авторизация с пустыми значениями email и password.");
    }
}
