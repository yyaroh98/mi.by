package by.mi.ui.pages.steps;

import by.mi.ui.pages.homePage.HomePage;
import by.mi.ui.pages.searchString.SearchStringPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SearchStep {

    private static final Logger logger = LogManager.getLogger();

    public void addOrderIntoBasket(String value) {

        logger.info("SearchStep - addOrderIntoBasket():{}", value);

        HomePage homePage = new HomePage();
        homePage.clickButtonAcceptCookie();

        SearchStringPage searchStringPage = new SearchStringPage();
        searchStringPage
                .sendKeysSearch(value)
                .clickButtonSearch()
                .clickButtonDetails()
                .clickButtonAddToBasket()
                .clickGoToTheBasket();
    }

    public void addTwoOrdersIntoBasket(String value1, String value2) {

        logger.info("SearchStep - addTwoOrdersIntoBasket(): value1{}, value2{}", value1, value2);

        addOrderIntoBasket(value1);
        SearchStringPage searchStringPage = new SearchStringPage();
        searchStringPage
                .sendKeysSearch(value2)
                .clickButtonSearch()
                .clickButtonDetails()
                .clickButtonAddToBasket()
                .clickGoToTheBasket();
    }
}
