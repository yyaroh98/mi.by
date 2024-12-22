package by.mi.ui;

import by.mi.ui.pages.searchString.SearchStringMessage;
import by.mi.ui.pages.searchString.SearchStringPage;
import by.mi.ui.pages.steps.SearchStep;
import by.mi.ui.utils.MobilePhones;
import by.mi.ui.utils.Tablets;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchStringTest extends BaseTest {
    private SearchStep searchStep;
    private SearchStringPage searchStringPage;

    @BeforeEach
    void setUpSearchPage() {
        searchStep = new SearchStep();
        searchStringPage = new SearchStringPage();
    }

    @Test
    @DisplayName("Добавление в корзину 'Смартфона Xiaomi MIX Flip', используя поиск страницы")
    public void testAddOrderToBasketUsingPageSearch() {

        searchStep.addOrderIntoBasket(MobilePhones.MOBILE_XIAOMI_MIX_FLIP);

        Assertions.assertEquals(SearchStringMessage.SMARTPHONE_XIAOMI_MIX_FLIP_IN_THE_BASKET, searchStringPage.getTextMobileInTheBasket());
    }

    @Test
    @DisplayName("Добавление в корзину 2 заказа 'Планшет Xiaomi Pad 6S Pro' и 'Смартфона Xiaomi MIX Flip', используя поиск страницы")
    public void testAddTwoOrdersToBasketUsingPageSearch() {

        searchStep.addTwoOrdersIntoBasket(MobilePhones.MOBILE_XIAOMI_MIX_FLIP, Tablets.TABLET_XIAOMI_PAD_6S_PRO);

        Assertions.assertEquals(SearchStringMessage.SMARTPHONE_XIAOMI_MIX_FLIP_IN_THE_BASKET, searchStringPage.getTextMobileInTheBasket());
        Assertions.assertEquals(SearchStringMessage.TABLET_XIAOMI_PAD_6S_PRO, searchStringPage.getTextTabletInTheBasket());
    }
}
