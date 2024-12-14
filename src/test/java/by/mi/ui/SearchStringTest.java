package by.mi.ui;

import by.mi.ui.pages.homePage.HomePage;
import by.mi.ui.pages.searchString.SearchStringPage;
import by.mi.ui.utils.MobilePhone;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchStringTest extends BaseTest {

    @Test
    @DisplayName("Добавление заказа в корзину используя поиск страницы")
    public void testAddOrderToBasketUsingPageSearch() {

        HomePage homePage = new HomePage();
        homePage.clickButtonAcceptCookie();

        SearchStringPage searchStringPage = new SearchStringPage();
        searchStringPage
                .sendKeysSearchMobilePhone("Смартфон Xiaomi 14 Ultra")
                .clickButtonSearch()
                .clickButtonDetails();

//                .enterValueInSearch()
//                .clickButtonSearch()
//                .clickButtonDetails();
//                .clickButtonAddToBasket()
//                .clickButtonBasket();
    }
}
