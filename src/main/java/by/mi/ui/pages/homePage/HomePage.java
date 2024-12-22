package by.mi.ui.pages.homePage;

import by.mi.ui.driver.Driver;
import by.mi.ui.pages.loginPage.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    public HomePage clickButtonCatalogMenu() {
        driver.findElement(By.xpath(HomePageXpath.BUTTON_CATALOG)).click();
        return this;
    }

    public HomePage clickCatalogMenuVacuumCleaners() {
        driver.findElement(By.xpath(HomePageXpath.BUTTON_CATALOG_MENU_VACUUM_CLEANERS)).click();
        return this;
    }

    public HomePage clickCatalogMenuHouseHoldAppliances() {
        driver.findElement(By.xpath(HomePageXpath.BUTTON_CATALOG_MENU_HOUSEHOLD_APPLIANCES)).click();
        return this;
    }

    public HomePage addToBasketFirstVacuumCleaner() {
        WebElement element = driver.findElement(By.xpath(HomePageXpath.BUTTON_ADD_TO_BASKET_VACUUM_CLEANERS));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        try {
            Thread.sleep(200);
        } catch (Exception e) {

        }
        element.click();
        return this;
    }

    public HomePage clickButtonGoToTheBasket() {
        driver.findElement(By.xpath(HomePageXpath.BUTTON_GO_TO_THE_BASKET)).click();
        return this;
    }

    public String getTextPageSmartphone() {
        return driver.findElement(By.xpath(HomePageXpath.TEXT_PAGE_SMARTPHONE)).getText();
    }

    public String getTextPageTablets() {
        return driver.findElement(By.xpath(HomePageXpath.TEXT_PAGE_TABLET)).getText();
    }

    public String getTextPageVacuumCleaners() {
        return driver.findElement(By.xpath(HomePageXpath.TEXT_PAGE_VACUUM_CLEANERS)).getText();
    }

    public String getTextPageHouseHoldAppliances() {
        return driver.findElement(By.xpath(HomePageXpath.TEXT_PAGE_HOUSEHOLD_APPLIANCES)).getText();
    }

    public String getTexVacuumCleanerInTheBasket() {
        return driver.findElement(By.xpath(HomePageXpath.TEXT_ORDER_IN_THE_BASKET_VACUUM_CLEANER)).getText();
    }
}
