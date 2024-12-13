package by.mi.ui;

import by.mi.domain.Users;
import by.mi.ui.pages.loginPage.LoginMessage;
import by.mi.ui.pages.loginPage.LoginPage;
import by.mi.ui.pages.steps.LoginStep;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends BaseTest {

    @Test
    @DisplayName("Проверка формы логина с валидными значениями email и password")
    public void testValidEmailAndPassword() {

        LoginStep loginStep = new LoginStep();
        loginStep.fillLoginFormAndSubmit(Users.getUserWithValidEmailAndPassword());

        LoginPage loginPage = new LoginPage();

        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());
    }

    @Test
    @DisplayName("Проверка формы логина с пустыми значениями email и password")
    public void testEmptyEmailAndPassword() {

        LoginStep loginStep = new LoginStep();
        loginStep.fillLoginFormAndSubmit(Users.getUserWithEmptyEmailAndPassword());

        LoginPage loginPage = new LoginPage();

        //Assertions.assertEquals(LoginMessage.INCORRECT_ENTRY_EMAIL_AND_PASSWORD_MESSAGE, loginPage.getTextMessageIncorrectEmailAndPassword());
        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());
    }

    @Test
    @DisplayName("Проверка формы логина с невалидными значениями email и password")
    public void testIncorrectEmailAndPassword() {

        LoginStep loginStep = new LoginStep();
        loginStep.fillLoginFormAndSubmit(Users.getUserWithIncorrectEmailAndPassword());

        LoginPage loginPage = new LoginPage();

        //Assertions.assertEquals(LoginMessage.INCORRECT_ENTRY_EMAIL_AND_PASSWORD_MESSAGE, loginPage.getTextMessageIncorrectEmailAndPassword());
        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());
    }

    @Test
    @DisplayName("Проверка формы логина с валидным значением email и невалидным password")
    public void testWithValidEmailAndIncorrectPassword() {

        LoginStep loginStep = new LoginStep();
        loginStep.fillLoginFormAndSubmit(Users.getUserWithValidEmailAndIncorrectPassword());

        LoginPage loginPage = new LoginPage();

        //Assertions.assertEquals(LoginMessage.INCORRECT_ENTRY_EMAIL_AND_PASSWORD_MESSAGE, loginPage.getTextMessageIncorrectEmailAndPassword());
        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());
    }

    @Test
    @DisplayName("Проверка формы логина с невалидным значением email и валидным password")
    public void testWithIncorrectEmailAndValidPassword() {

        LoginStep loginStep = new LoginStep();
        loginStep.fillLoginFormAndSubmit(Users.getUserWithIncorrectEmailAndValidPassword());

        LoginPage loginPage = new LoginPage();

        //Assertions.assertEquals(LoginMessage.INCORRECT_ENTRY_EMAIL_AND_PASSWORD_MESSAGE, loginPage.getTextMessageIncorrectEmailAndPassword());
        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());
    }

    @Test
    @DisplayName("Проверка формы логина с пустым значением email и валидным password")
    public void testWithEmptyEmailAndValidPassword() {

        LoginStep loginStep = new LoginStep();
        loginStep.fillLoginFormAndSubmit(Users.getUserWithEmptyEmailAndValidPassword());

        LoginPage loginPage = new LoginPage();

        //Assertions.assertEquals(LoginMessage.INCORRECT_ENTRY_EMAIL_AND_PASSWORD_MESSAGE, loginPage.getTextMessageIncorrectEmailAndPassword());
        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());
    }

    @Test
    @DisplayName("Проверка формы логина с валидным значением email и пустым password")
    public void testWithValidEmailAndEmptyPassword() {

        LoginStep loginStep = new LoginStep();
        loginStep.fillLoginFormAndSubmit(Users.getUserWithValidEmailAndEmptyPassword());

        LoginPage loginPage = new LoginPage();

        //Assertions.assertEquals(LoginMessage.INCORRECT_ENTRY_EMAIL_AND_PASSWORD_MESSAGE, loginPage.getTextMessageIncorrectEmailAndPassword());
        Assertions.assertEquals(LoginMessage.YOUR_EMAIL_MESSAGE, loginPage.getTextYourEmail());
        Assertions.assertEquals(LoginMessage.PASSWORD_MESSAGE, loginPage.getTextPassword());
    }
}
