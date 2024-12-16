package by.mi.api;

import by.mi.domain.User;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class LoginRequest {

    public static RequestSpecification requestSpecification;

    public static void initRequestSpecification() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://mi.by")
                .setBasePath("/bitrix/services/main/ajax.php?mode=ajax&c=mi%3Aauthorization&action=login")
                .setContentType("application/x-www-form-urlencoded")
                .build();
    }

    public static String getBody(String email, String password) {
        return "login=" + email + "&password=" + password;
    }

    public static String getBody(User user) {
        return getBody(user.getEmail(), user.getPassword());
    }
}


