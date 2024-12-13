package by.mi.ui.pages.loginPage;

public class LoginXpath {
    public static final String INPUT_EMAIL = "//input[@id='input-login-1']";
    public static final String INPUT_PASSWORD = "//input[@id='input-login-2']";
    public static final String BUTTON_SUBMIT = "//button[@type=\"submit\"][text()='Войти']";
    public static final String MESSAGE_INCORRECT_ENTRY_EMAIL_AND_PASSWORD = "//*[@id=\"modal-login\"]//span[contains(text(),'Некорректный ввод')]";
    public static final String MESSAGE_EMAIL = "//*[@id=\"modal-login\"]//label[contains(text(),'Ваш e-mail')]";
    public static final String MESSAGE_PASSWORD = "//*[@id=\"modal-login\"]//label[contains(text(),'Пароль')]";
}

