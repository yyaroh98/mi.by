package by.mi.ui;

import by.mi.domain.Users;
import by.mi.ui.pages.loginPage.LoginMessage;
import by.mi.ui.pages.loginPage.LoginPage;
import by.mi.ui.pages.steps.LoginStep;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends BaseTest {
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

        loginStep.fillLoginFormAndSubmit(Users.getUserWithValidEmailAndPassword());

        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());
    }

    @Test
    @DisplayName("Проверка формы логина с пустыми значениями email и password")
    public void testEmptyEmailAndPassword() {

        loginStep.fillLoginFormAndSubmit(Users.getUserWithEmptyEmailAndPassword());

        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());
    }

    @Test
    @DisplayName("Проверка формы логина с невалидными значениями email и password")
    public void testIncorrectEmailAndPassword() {

        loginStep.fillLoginFormAndSubmit(Users.getUserWithIncorrectEmailAndPassword());

        Assertions.assertEquals(LoginMessage.INCORRECT_ENTRY_EMAIL_AND_PASSWORD_MESSAGE, loginPage.getTextMessageIncorrectEmailAndPassword());
        // не читает loginPage.getTextMessageIncorrectEmailAndPassword()
    }

    @Test
    @DisplayName("Проверка формы логина с валидным значением email и невалидным password")
    public void testWithValidEmailAndIncorrectPassword() {

        loginStep.fillLoginFormAndSubmit(Users.getUserWithValidEmailAndIncorrectPassword());

        Assertions.assertEquals(LoginMessage.INCORRECT_ENTRY_EMAIL_AND_PASSWORD_MESSAGE, loginPage.getTextMessageIncorrectEmailAndPassword());
    }

    @Test
    @DisplayName("Проверка формы логина с невалидным значением email и валидным password")
    public void testWithIncorrectEmailAndValidPassword() {

        loginStep.fillLoginFormAndSubmit(Users.getUserWithIncorrectEmailAndValidPassword());

        Assertions.assertEquals(LoginMessage.INCORRECT_ENTRY_EMAIL_AND_PASSWORD_MESSAGE, loginPage.getTextMessageIncorrectEmailAndPassword());
    }

    @Test
    @DisplayName("Проверка формы логина с пустым значением email и валидным password")
    public void testWithEmptyEmailAndValidPassword() {

        loginStep.fillLoginFormAndSubmit(Users.getUserWithEmptyEmailAndValidPassword());

        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());
    }

    @Test
    @DisplayName("Проверка формы логина с валидным значением email и пустым password")
    public void testWithValidEmailAndEmptyPassword() {

        loginStep.fillLoginFormAndSubmit(Users.getUserWithValidEmailAndEmptyPassword());

        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());
    }
}
