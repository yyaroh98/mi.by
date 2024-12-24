package by.mi.ui;

import by.mi.ui.pages.homePage.HomePage;
import by.mi.ui.pages.homePage.HomePageMessage;
import by.mi.ui.utils.VacuumCleaners;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger();
    private HomePage homePage;

    @BeforeEach
    void setUpHomePage() {

        homePage = new HomePage();
        homePage.clickButtonAcceptCookie();
    }

    @Test
    @DisplayName("Проверка открытия страницы 'Cмартфоны'")
    public void testCheckOpenPageSmartphone() {

        logger.info("Начало - Тест testCheckOpenPageSmartphone(). Проверка открытия страницы 'Cмартфоны'.");

        homePage.clickHeaderMenuSmartphone();

        logger.info("HomePageMessage.TEXT_PAGE_SMARTPHONES()" + HomePageMessage.TEXT_PAGE_SMARTPHONES);
        logger.info("homePage.getTextPageSmartphone()" + homePage.getTextPageSmartphone());
        Assertions.assertEquals(HomePageMessage.TEXT_PAGE_SMARTPHONES, homePage.getTextPageSmartphone());

        logger.info("Конец - Тест testCheckOpenPageSmartphone(). Проверка открытия страницы 'Cмартфоны'.");
    }

    @Test
    @DisplayName("Проверка открытия страницы 'Планшеты'")
    public void testCheckOpenPageTablet() {

        logger.info("Начало - Тест testCheckOpenPageTablet(). Проверка открытия страницы 'Планшеты'.");

        homePage.clickHeaderMenuTablets();

        Assertions.assertEquals(HomePageMessage.TEXT_PAGE_TABLET, homePage.getTextPageTablets());

        logger.info("Конец - Тест testCheckOpenPageTablet(). Проверка открытия страницы 'Планшеты'.");
    }

    @Test
    @DisplayName("Проверка открытия страницы 'Бытовая техника' через каталог")
    public void testCheckOpenPageHouseHoldAppliancesUsingCatalog() {

        logger.info("Начало - Тест testCheckOpenPageHouseHoldAppliancesUsingCatalog(). Проверка открытия страницы 'Бытовая техника' через каталог.");

        homePage
                .clickButtonCatalogMenu()
                .clickCatalogMenuHouseHoldAppliances();

        Assertions.assertEquals(HomePageMessage.TEXT_PAGE_HOUSEHOLD_APPLIANCES, homePage.getTextPageHouseHoldAppliances());

        logger.info("Конец - Тест testCheckOpenPageHouseHoldAppliancesUsingCatalog(). Проверка открытия страницы 'Бытовая техника' через каталог.");
    }

    @Test
    @DisplayName("Проверка открытия страницы 'Пылесосы' через каталог")
    public void testCheckOpenPageVacuumCleanersUsingCatalog() {

        logger.info("Начало - Тест testCheckOpenPageVacuumCleanersUsingCatalog(). Проверка открытия страницы 'Пылесосы' через каталог.");

        homePage
                .clickButtonCatalogMenu()
                .clickCatalogMenuVacuumCleaners();

        Assertions.assertEquals(HomePageMessage.TEXT_PAGE_VACUUM_CLEANERS, homePage.getTextPageVacuumCleaners());

        logger.info("Конец - Тест testCheckOpenPageVacuumCleanersUsingCatalog(). Проверка открытия страницы 'Пылесосы' через каталог.");
    }

    @Test
    @DisplayName("Добавления первого пылесоса через каталог в корзину")
    public void testAddToTheBasketFirstVacuumCleanersUsingCatalog() {

        logger.info("Начало - Тест testAddToTheBasketFirstVacuumCleanersUsingCatalog(). Добавления первого пылесоса через каталог в корзину.");

        homePage
                .clickButtonCatalogMenu()
                .clickCatalogMenuVacuumCleaners()
                .addToBasketFirstVacuumCleaner()
                .clickButtonGoToTheBasket();

        Assertions.assertEquals(VacuumCleaners.VACUUM_CLEANER_XIAOMI_ROBOT_VACUUM_X20, homePage.getTexVacuumCleanerInTheBasket());

        logger.info("Конец - Тест testAddToTheBasketFirstVacuumCleanersUsingCatalog(). Добавления первого пылесоса через каталог в корзину.");
    }
}
