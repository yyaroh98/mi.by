package by.mi.ui.pages.homePage;

import by.mi.ui.driver.Driver;
import by.mi.ui.driver.Wait;
import by.mi.ui.pages.loginPage.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private static final Logger logger = LogManager.getLogger();
    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage() {
        driver = Driver.getDriver();
        wait = Wait.getWait();
        // wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public HomePage clickButtonAcceptCookie() {
        logger.info("HomePage - clickButtonAcceptCookie()");
        driver.findElement(By.xpath(HomePageXpath.BUTTON_ACCEPT_COOKIES)).click();
        return this;
    }

    public LoginPage clickButtonLogin() {
        logger.info("HomePage - clickButtonLogin()");
        driver.findElement(By.xpath(HomePageXpath.BUTTON_LOGIN)).click();
        return new LoginPage();
    }

    public HomePage clickHeaderMenuSmartphone() {
        logger.info("HomePage - clickHeaderMenuSmartphone()");
        driver.findElement(By.xpath(HomePageXpath.BUTTON_MENU_SMARTPHONE)).click();
        return this;
    }

    public HomePage clickHeaderMenuTablets() {
        logger.info("HomePage - clickHeaderMenuTablets()");
        driver.findElement(By.xpath(HomePageXpath.BUTTON_MENU_TABLETS)).click();
        return this;
    }

    public HomePage clickButtonCatalogMenu() {
        logger.info("HomePage - clickButtonCatalogMenu()");
        driver.findElement(By.xpath(HomePageXpath.BUTTON_CATALOG)).click();
        return this;
    }

    public HomePage clickCatalogMenuVacuumCleaners() {
        logger.info("HomePage - clickCatalogMenuVacuumCleaners()");
        driver.findElement(By.xpath(HomePageXpath.BUTTON_CATALOG_MENU_VACUUM_CLEANERS)).click();
        return this;
    }

    public HomePage clickCatalogMenuHouseHoldAppliances() {
        logger.info("HomePage - clickCatalogMenuHouseHoldAppliances()");
        driver.findElement(By.xpath(HomePageXpath.BUTTON_CATALOG_MENU_HOUSEHOLD_APPLIANCES)).click();
        return this;
    }

    public HomePage addToBasketFirstVacuumCleaner() {
        logger.info("HomePage - addToBasketFirstVacuumCleaner()");
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
        logger.info("HomePage - clickButtonGoToTheBasket()");
        driver.findElement(By.xpath(HomePageXpath.BUTTON_GO_TO_THE_BASKET)).click();
        return this;
    }

    public String getTextPageSmartphone() {
        logger.info("HomePage - getTextPageSmartphone()");
        return driver.findElement(By.xpath(HomePageXpath.TEXT_PAGE_SMARTPHONE)).getText();
    }

    public String getTextPageTablets() {
        logger.info("HomePage - getTextPageTablets()");
        return driver.findElement(By.xpath(HomePageXpath.TEXT_PAGE_TABLET)).getText();
    }

    public String getTextPageVacuumCleaners() {
        logger.info("HomePage - getTextPageVacuumCleaners()");
        return driver.findElement(By.xpath(HomePageXpath.TEXT_PAGE_VACUUM_CLEANERS)).getText();
    }

    public String getTextPageHouseHoldAppliances() {
        logger.info("HomePage - getTextPageHouseHoldAppliances()");
        return driver.findElement(By.xpath(HomePageXpath.TEXT_PAGE_HOUSEHOLD_APPLIANCES)).getText();
    }

    public String getTexVacuumCleanerInTheBasket() {
        logger.info("HomePage - getTexVacuumCleanerInTheBasket()");
        return driver.findElement(By.xpath(HomePageXpath.TEXT_ORDER_IN_THE_BASKET_VACUUM_CLEANER)).getText();
    }
}
