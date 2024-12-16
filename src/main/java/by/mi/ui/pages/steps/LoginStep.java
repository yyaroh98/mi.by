package by.mi.ui.pages.steps;

import by.mi.domain.User;
import by.mi.ui.pages.homePage.HomePage;
import by.mi.ui.pages.loginPage.LoginPage;

public class LoginStep {

    public void fillLoginFormAndSubmit(String email, String password) {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();

        homePage
                .clickButtonAcceptCookie()
                .clickButtonLogin()
                .sendKeysEmail(email)
                .sendKeysPassword(password)
                .clickButtonEnter();
    }

    public void fillLoginFormAndSubmit(User user) {
        fillLoginFormAndSubmit(user.getEmail(), user.getPassword());
    }
}

