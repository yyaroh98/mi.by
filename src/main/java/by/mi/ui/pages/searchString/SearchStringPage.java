package by.mi.ui.pages.searchString;

import by.mi.ui.driver.Driver;
import by.mi.ui.driver.Wait;
import by.mi.ui.pages.homePage.HomePageXpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchStringPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public SearchStringPage() {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(7));
    }

    public SearchStringPage sendKeysSearchMobilePhone(String mobilePhone) {
        driver.findElement(By.xpath(HomePageXpath.SEARCH_STRING)).sendKeys(mobilePhone);
        return this;
    }

    public SearchStringPage clickButtonSearch() {
        driver.findElement(By.xpath(HomePageXpath.BUTTON_SEARCH)).click();
        return this;
    }

    public SearchStringPage clickButtonDetails() {
       WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SearchStringXpath.BUTTON_DETAILS1)));
              driver.findElement(By.xpath(SearchStringXpath.BUTTON_DETAILS)).click();
        return this;
    }

    public SearchStringPage clickButtonAddToBasket() {
        driver.findElement(By.xpath(SearchStringXpath.BUTTON_ADD_TO_BASKET)).click();
        return this;
    }

    public SearchStringPage clickButtonBasket() {
        driver.findElement(By.xpath(HomePageXpath.BUTTON_BASKET)).click();
        return this;
    }


}
