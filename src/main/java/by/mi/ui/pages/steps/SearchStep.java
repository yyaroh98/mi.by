package by.mi.ui.pages.steps;

import by.mi.ui.pages.homePage.HomePage;
import by.mi.ui.pages.searchString.SearchStringPage;

public class SearchStep {
    public void addOrderIntoBasket(String mobile) {

        HomePage homePage = new HomePage();
        homePage.clickButtonAcceptCookie();

        SearchStringPage searchStringPage = new SearchStringPage();
        searchStringPage
                .sendKeysSearchMobilePhone(mobile)
                .clickButtonSearch()
                .clickButtonDetails()
                .clickButtonAddToBasket()
                .clickGoToTheBasket();
    }
}

