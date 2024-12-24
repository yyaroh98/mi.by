package by.mi.ui.pages.loginPage;

import by.mi.ui.driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private static final Logger logger = LogManager.getLogger();
    private WebDriver driver;

    public LoginPage() {
        driver = Driver.getDriver();
    }

    public LoginPage sendKeysEmail(String email) {
        logger.info("LoginPage - sendKeysEmail():{}", email);
        driver.findElement(By.xpath(LoginXpath.INPUT_EMAIL)).sendKeys(email);
        return this;
    }

    public LoginPage sendKeysPassword(String password) {
        logger.info("LoginPage - sendKeysPassword():{}", password);
        driver.findElement(By.xpath(LoginXpath.INPUT_PASSWORD)).sendKeys(password);
        return this;
    }

    public LoginPage clickButtonEnter() {
        logger.info("LoginPage - clickButtonEnter()");
        driver.findElement(By.xpath(LoginXpath.BUTTON_SUBMIT)).click();
        return this;
    }

    public String getTextMessageIncorrectEmailAndPassword() {
        logger.info("LoginPage - getTextMessageIncorrectEmailAndPassword()");
        return driver.findElement(By.xpath(LoginXpath.MESSAGE_INCORRECT_ENTRY_EMAIL_AND_PASSWORD)).getText();
    }

    public String getTextYourEmail() {
        logger.info("LoginPage - getTextYourEmail()");
        return driver.findElement(By.xpath(LoginXpath.MESSAGE_EMAIL)).getText();
    }

    public String getTextPassword() {
        logger.info("LoginPage - getTextPassword()");
        return driver.findElement(By.xpath(LoginXpath.MESSAGE_PASSWORD)).getText();
    }
}
