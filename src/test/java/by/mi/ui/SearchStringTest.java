package by.mi.ui;

import by.mi.ui.pages.homePage.HomePage;
import by.mi.ui.pages.searchString.SearchStringMessage;
import by.mi.ui.pages.searchString.SearchStringPage;
import by.mi.ui.pages.searchString.SearchStringXpath;
import by.mi.ui.pages.steps.SearchStep;
import by.mi.ui.utils.MobilePhone;
import io.restassured.internal.common.assertion.Assertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchStringTest extends BaseTest {

    @Test
    @DisplayName("Добавление 'Смартфон Xiaomi 14 Ultra' в корзину, используя поиск страницы")
    public void testAddOrderToBasketUsingPageSearch() {

        SearchStep searchStep = new SearchStep();
        searchStep.addOrderIntoBasket(MobilePhone.MOBILE_XIAOMI_14_ULTRA);

        SearchStringPage searchStringPage = new SearchStringPage();
        Assertions.assertEquals(SearchStringMessage.SMARTPHONE_XIAOMI_14_ULTRA, searchStringPage.getTextMobileInTheBasket());
    }
}

//@Test
//@DisplayName("Добавление заказа в корзину используя поиск страницы")
//public void testAddOrderToBasketUsingPageSearch() {
//
//    HomePage homePage = new HomePage();
//    homePage.clickButtonAcceptCookie();
//
//    SearchStringPage searchStringPage = new SearchStringPage();
//    searchStringPage
//            .sendKeysSearchMobilePhone("Смартфон Xiaomi 14 Ultra")
//            .clickButtonSearch()
//            .clickButtonDetails()
//            .clickButtonAddToBasket()
//            .clickGoToTheBasket();
//
//    Assertions.assertEquals(SearchStringMessage.SMARTPHONE_XIAOMI_14_ULTRA, searchStringPage.getTextMobileInTheBasket());
//}