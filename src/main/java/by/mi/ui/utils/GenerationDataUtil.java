package by.mi.ui.utils;

import com.github.javafaker.Faker;

import java.util.Random;

public class GenerationDataUtil {

    public static String generateValidEmail() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }

    public static String generateValidPassword() {
        Faker faker = new Faker();
        return faker.internet().password();
    }

    public static String generateIncorrectEmail() {
        Faker faker = new Faker();
        return faker.name().username();
    }

    public static String generateRandomPassword() {
        Random random = new Random();
        int maxLength = 10;
        int minLength = 4;
        int length = random.nextInt(maxLength - minLength + 1) + minLength;

        String symbol = "~!@#$%^&*()_=+-|/?;:";
        char[] symbols = new char[length];
        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = symbol.charAt(random.nextInt(symbol.length()));
        }
        return new String(symbols);
    }
}
