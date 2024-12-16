package by.mi.domain;

import com.github.javafaker.Faker;

public class Users {

    public static User getUserWithValidEmailAndPassword() {
        Faker faker = new Faker();
        return new User(faker.internet().emailAddress(), faker.internet().password());
    }

    public static User getUserWithIncorrectEmailAndPassword() {
        Faker faker = new Faker();
        return new User(faker.name().username(), "..f3f");
    }

    public static User getUserWithEmptyEmailAndPassword() {
        return new User("", "");
    }

    public static User getUserWithValidEmailAndEmptyPassword() {
        Faker faker = new Faker();
        return new User(faker.internet().emailAddress(), "");
    }

    public static User getUserWithEmptyEmailAndValidPassword() {
        Faker faker = new Faker();
        return new User("", faker.internet().password());
    }

    public static User getUserWithValidEmailAndIncorrectPassword() {
        Faker faker = new Faker();
        return new User(faker.internet().emailAddress(), "..!432d");
    }

    public static User getUserWithIncorrectEmailAndValidPassword() {
        Faker faker = new Faker();
        return new User(faker.name().username(), faker.internet().password());
    }
}


