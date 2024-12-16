package by.mi.ui.utils;

import com.github.javafaker.Faker;

public class GenerationDataUtil {

    public static String generateEmail() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }

    public static String generatePassword() {
        Faker faker = new Faker();
        return faker.internet().password();
    }
}
