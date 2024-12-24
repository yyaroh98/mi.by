package by.mi.ui.pages.searchString;

import by.mi.ui.driver.Driver;
import by.mi.ui.pages.homePage.HomePageXpath;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchStringPage {

    private static final Logger logger = LogManager.getLogger();
    private WebDriver driver;
    private WebDriverWait wait;

    public SearchStringPage() {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(7));
    }

    public SearchStringPage sendKeysSearch(String value) {
        logger.info("SearchStringPage - sendKeysSearch():{}", value);
        driver.findElement(By.xpath(HomePageXpath.SEARCH_STRING)).sendKeys(value);
        return this;
    }

    public SearchStringPage clickButtonSearch() {
        logger.info("SearchStringPage - clickButtonSearch()");
        driver.findElement(By.xpath(HomePageXpath.BUTTON_SEARCH)).click();
        return this;
    }

    public SearchStringPage clickButtonDetails() {
        logger.info("SearchStringPage - clickButtonDetails()");
        WebElement element = driver.findElement(By.xpath(SearchStringXpath.BUTTON_DETAILS));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        try {
            Thread.sleep(200);
        } catch (Exception e) {

        }
        element.click();
        return this;
    }

    public SearchStringPage clickButtonAddToBasket() {
        logger.info("SearchStringPage - clickButtonAddToBasket()");
        driver.findElement(By.xpath(SearchStringXpath.BUTTON_ADD_TO_BASKET)).click();
        return this;
    }

    public SearchStringPage clickGoToTheBasket() {
        logger.info("SearchStringPage - clickGoToTheBasket()");
        driver.findElement(By.xpath(SearchStringXpath.BUTTON_GO_TO_THE_BASKET)).click();
        return this;
    }

    public String getTextMobileInTheBasket() {
        logger.info("SearchStringPage - getTextMobileInTheBasket()");
        return driver.findElement(By.xpath(SearchStringXpath.NAME_MOBILE_IN_BASKET)).getText();
    }

    public String getTextTabletInTheBasket() {
        logger.info("SearchStringPage - getTextTabletInTheBasket()");
        return driver.findElement(By.xpath(SearchStringXpath.NAME_TABLET_IN_BASKET)).getText();
    }
}
