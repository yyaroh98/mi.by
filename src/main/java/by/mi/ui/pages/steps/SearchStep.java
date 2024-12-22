package by.mi.ui.pages.steps;

import by.mi.ui.pages.homePage.HomePage;
import by.mi.ui.pages.searchString.SearchStringPage;

public class SearchStep {
    public void addOrderIntoBasket(String value) {

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
