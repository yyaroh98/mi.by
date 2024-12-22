package by.mi.ui;

import by.mi.ui.pages.homePage.HomePage;
import by.mi.ui.pages.homePage.HomePageMessage;
import by.mi.ui.utils.VacuumCleaners;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {
    private HomePage homePage;

    @BeforeEach
    void setUpHomePage() {

        homePage = new HomePage();
        homePage.clickButtonAcceptCookie();
    }

    @Test
    @DisplayName("Проверка открытия страницы 'Cмартфоны'")
    public void testCheckOpenPageSmartphone() {

        homePage.clickHeaderMenuSmartphone();

        Assertions.assertEquals(HomePageMessage.TEXT_PAGE_SMARTPHONES, homePage.getTextPageSmartphone());
    }

    @Test
    @DisplayName("Проверка открытия страницы 'Планшеты'")
    public void testCheckOpenPageTablet() {

        homePage.clickHeaderMenuTablets();

        Assertions.assertEquals(HomePageMessage.TEXT_PAGE_TABLET, homePage.getTextPageTablets());
    }

    @Test
    @DisplayName("Проверка открытия страницы 'Бытовая техника' через каталог")
    public void testCheckOpenPageHouseHoldAppliancesUsingCatalog() {

        homePage
                .clickButtonCatalogMenu()
                .clickCatalogMenuHouseHoldAppliances();

        Assertions.assertEquals(HomePageMessage.TEXT_PAGE_HOUSEHOLD_APPLIANCES, homePage.getTextPageHouseHoldAppliances());
    }

    @Test
    @DisplayName("Проверка открытия страницы 'Пылесосы' через каталог")
    public void testCheckOpenPageVacuumCleanersUsingCatalog() {

        homePage
                .clickButtonCatalogMenu()
                .clickCatalogMenuVacuumCleaners();

        Assertions.assertEquals(HomePageMessage.TEXT_PAGE_VACUUM_CLEANERS, homePage.getTextPageVacuumCleaners());
    }

    @Test
    @DisplayName("Добавления первого пылесоса через каталог в корзину")
    public void testAddToTheBasketFirstVacuumCleanersUsingCatalog() {

        homePage
                .clickButtonCatalogMenu()
                .clickCatalogMenuVacuumCleaners()
                .addToBasketFirstVacuumCleaner()
                .clickButtonGoToTheBasket();

        Assertions.assertEquals(VacuumCleaners.VACUUM_CLEANER_XIAOMI_ROBOT_VACUUM_X20, homePage.getTexVacuumCleanerInTheBasket());
    }
}
