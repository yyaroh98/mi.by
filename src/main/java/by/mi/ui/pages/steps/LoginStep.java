package by.mi.ui.pages.steps;

import by.mi.domain.User;
import by.mi.ui.pages.homePage.HomePage;
import by.mi.ui.pages.loginPage.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginStep {

    private static final Logger logger = LogManager.getLogger();

    public void fillLoginFormAndSubmit(String email, String password) {

        logger.info("LoginStep - fillLoginFormAndSubmit: email{}, password{}", email, password);
        HomePage homePage = new HomePage();

        homePage
                .clickButtonAcceptCookie()
                .clickButtonLogin()
                .sendKeysEmail(email)
                .sendKeysPassword(password)
                .clickButtonEnter();
    }

    public void fillLoginFormAndSubmit(User user) {
        logger.info("LoginStep - fillLoginFormAndSubmit():{}", user);
        fillLoginFormAndSubmit(user.getEmail(), user.getPassword());
    }
}
