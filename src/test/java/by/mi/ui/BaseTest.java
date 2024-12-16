package by.mi.ui;

import by.mi.ui.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeEach
    public void startFormHome() {
        Driver.getDriver().get("https://mi.by/");
    }

    @AfterEach
    public void tearDown() {
        Driver.quit();
    }
}
