package by.mi.ui.pages.loginPage;

import by.mi.ui.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    public LoginPage() {
        driver = Driver.getDriver();
    }

    public LoginPage sendKeysEmail(String email) {
        driver.findElement(By.xpath(LoginXpath.INPUT_EMAIL)).sendKeys(email);
        return this;
    }

    public LoginPage sendKeysPassword(String password) {
        driver.findElement(By.xpath(LoginXpath.INPUT_PASSWORD)).sendKeys(password);
        return this;
    }

    public LoginPage clickButtonEnter() {
        driver.findElement(By.xpath(LoginXpath.BUTTON_SUBMIT)).click();
        return this;
    }

    public String getTextMessageIncorrectEmailAndPassword() {
        return driver.findElement(By.xpath(LoginXpath.MESSAGE_INCORRECT_ENTRY_EMAIL_AND_PASSWORD)).getText();
    }

    public String getTextYourEmail() {
        return driver.findElement(By.xpath(LoginXpath.MESSAGE_EMAIL)).getText();
    }

    public String getTextPassword() {
        return driver.findElement(By.xpath(LoginXpath.MESSAGE_PASSWORD)).getText();
    }
}

