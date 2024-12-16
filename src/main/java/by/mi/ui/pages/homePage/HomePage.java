package by.mi.ui.pages.homePage;

import by.mi.ui.driver.Driver;
import by.mi.ui.pages.loginPage.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage() {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public HomePage clickButtonAcceptCookie() {
        driver.findElement(By.xpath(HomePageXpath.BUTTON_ACCEPT_COOKIES)).click();
        return this;
    }

    public LoginPage clickButtonLogin() {
        driver.findElement(By.xpath(HomePageXpath.BUTTON_LOGIN)).click();
        return new LoginPage();
    }

    public HomePage clickHeaderMenuSmartphone() {
        driver.findElement(By.xpath(HomePageXpath.BUTTON_MENU_SMARTPHONE)).click();
        return this;
    }

    public HomePage clickHeaderMenuTablets() {
        driver.findElement(By.xpath(HomePageXpath.BUTTON_MENU_TABLETS)).click();
        return this;
    }

    public String getTextPageSmartphone() {
        return driver.findElement(By.xpath(HomePageXpath.TEXT_PAGE_SMARTPHONE)).getText();
    }

    public String getTextPageTablets() {
        return driver.findElement(By.xpath(HomePageXpath.TEXT_PAGE_TABLET)).getText();
    }

    public String getTextMobileInTheBasket() {
        return driver.findElement(By.xpath(HomePageXpath.TEXT_ORDER_IN_THE_BASKET)).getText();
    }
}

