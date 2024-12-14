package by.mi.ui;

import by.mi.ui.pages.homePage.HomePage;
import by.mi.ui.pages.homePage.HomePageMessage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {

    @Test
    @DisplayName("Проверка открытия старницы 'Cмартфоны'")
    public void testCheckOpenPageSmartphone() {
        HomePage homePage = new HomePage();

        homePage
                .clickButtonAcceptCookie()
                .clickHeaderMenuSmartphone();

        Assertions.assertEquals(HomePageMessage.TEXT_PAGE_SMARTPHONES, homePage.getTextPageSmartphone());
    }

    @Test
    @DisplayName("Проверка открытия старницы 'Планшеты'")
    public void testCheckOpenPageTablet() {
        HomePage homePage = new HomePage();

        homePage
                .clickButtonAcceptCookie()
                .clickHeaderMenuTablets();

        Assertions.assertEquals(HomePageMessage.TEXT_PAGE_TABLET, homePage.getTextPageTablets());
    }
}
