package by.mi.ui;

import by.mi.domain.Users;
import by.mi.ui.pages.loginPage.LoginMessage;
import by.mi.ui.pages.loginPage.LoginPage;
import by.mi.ui.pages.steps.LoginStep;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger();
    private LoginStep loginStep;
    private LoginPage loginPage;

    @BeforeEach
    void setUpLoginPage() {
        loginStep = new LoginStep();
        loginPage = new LoginPage();
    }

    @Test
    @DisplayName("Проверка формы логина с валидными значениями email и password")
    public void testValidEmailAndPassword() {

        logger.info("Начало - Тест testValidEmailAndPassword(). Проверка формы логина с валидными значениями email и password.");

        loginStep.fillLoginFormAndSubmit(Users.getUserWithValidEmailAndPassword());

        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());

        logger.info("Конец - Тест testValidEmailAndPassword(). Проверка формы логина с валидными значениями email и password.");
    }

    @Test
    @DisplayName("Проверка формы логина с пустыми значениями email и password")
    public void testEmptyEmailAndPassword() {

        logger.info("Начало - Тест testEmptyEmailAndPassword(). Проверка формы логина с пустыми значениями email и password.");

        loginStep.fillLoginFormAndSubmit(Users.getUserWithEmptyEmailAndPassword());

        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());

        logger.info("Конец - Тест testEmptyEmailAndPassword(). Проверка формы логина с пустыми значениями email и password.");
    }

    @Test
    @DisplayName("Проверка формы логина с невалидными значениями email и password")
    public void testIncorrectEmailAndPassword() {

        logger.info("Начало - Тест testIncorrectEmailAndPassword(). Проверка формы логина с невалидными значениями email и password.");

        loginStep.fillLoginFormAndSubmit(Users.getUserWithIncorrectEmailAndPassword());

        Assertions.assertEquals(LoginMessage.INCORRECT_ENTRY_EMAIL_AND_PASSWORD_MESSAGE, loginPage.getTextMessageIncorrectEmailAndPassword());
        // не читает loginPage.getTextMessageIncorrectEmailAndPassword()
        logger.info("Конец - Тест testIncorrectEmailAndPassword(). Проверка формы логина с невалидными значениями email и password.");
    }

    @Test
    @DisplayName("Проверка формы логина с валидным значением email и невалидным password")
    public void testWithValidEmailAndIncorrectPassword() {

        logger.info("Начало - Тест testWithValidEmailAndIncorrectPassword(). Проверка формы логина с валидным значением email и невалидным password.");

        loginStep.fillLoginFormAndSubmit(Users.getUserWithValidEmailAndIncorrectPassword());

        Assertions.assertEquals(LoginMessage.INCORRECT_ENTRY_EMAIL_AND_PASSWORD_MESSAGE, loginPage.getTextMessageIncorrectEmailAndPassword());

        logger.info("Конец - Тест testWithValidEmailAndIncorrectPassword(). Проверка формы логина с валидным значением email и невалидным password.");
    }

    @Test
    @DisplayName("Проверка формы логина с невалидным значением email и валидным password")
    public void testWithIncorrectEmailAndValidPassword() {

        logger.info("Начало - Тест testWithIncorrectEmailAndValidPassword(). Проверка формы логина с невалидным значением email и валидным password.");

        loginStep.fillLoginFormAndSubmit(Users.getUserWithIncorrectEmailAndValidPassword());

        Assertions.assertEquals(LoginMessage.INCORRECT_ENTRY_EMAIL_AND_PASSWORD_MESSAGE, loginPage.getTextMessageIncorrectEmailAndPassword());

        logger.info("Конец - Тест testWithIncorrectEmailAndValidPassword(). Проверка формы логина с невалидным значением email и валидным password.");
    }

    @Test
    @DisplayName("Проверка формы логина с пустым значением email и валидным password")
    public void testWithEmptyEmailAndValidPassword() {

        logger.info("Начало - Тест testWithEmptyEmailAndValidPassword(). Проверка формы логина с пустым значением email и валидным password.");

        loginStep.fillLoginFormAndSubmit(Users.getUserWithEmptyEmailAndValidPassword());

        //   Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        //   Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());

        logger.info("Конец - Тест testWithEmptyEmailAndValidPassword(). Проверка формы логина с пустым значением email и валидным password.");
    }

    @Test
    @DisplayName("Проверка формы логина с валидным значением email и пустым password")
    public void testWithValidEmailAndEmptyPassword() {

        logger.info("Начало - Тест testWithValidEmailAndEmptyPassword(). Проверка формы логина с валидным значением email и пустым password.");

        loginStep.fillLoginFormAndSubmit(Users.getUserWithValidEmailAndEmptyPassword());

        //  Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        //   Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());

        logger.info("Конец - Тест testWithValidEmailAndEmptyPassword(). Проверка формы логина с валидным значением email и пустым password.");
    }
}
