package by.mi.domain;

import by.mi.ui.utils.GenerationDataUtil;

public class Users {

    public static User getUserWithValidEmailAndPassword() {
        return new User(GenerationDataUtil.generateValidEmail(), GenerationDataUtil.generateValidPassword());
    }

    public static User getUserWithIncorrectEmailAndPassword() {
        return new User(GenerationDataUtil.generateIncorrectEmail(), GenerationDataUtil.generateRandomPassword());
    }

    public static User getUserWithEmptyEmailAndPassword() {
        return new User("", "");
    }

    public static User getUserWithValidEmailAndEmptyPassword() {
        return new User(GenerationDataUtil.generateValidEmail(), "");
    }

    public static User getUserWithEmptyEmailAndValidPassword() {
        return new User("", GenerationDataUtil.generateValidPassword());
    }

    public static User getUserWithValidEmailAndIncorrectPassword() {
        return new User(GenerationDataUtil.generateValidPassword(), GenerationDataUtil.generateRandomPassword());
    }

    public static User getUserWithIncorrectEmailAndValidPassword() {
        return new User(GenerationDataUtil.generateIncorrectEmail(), GenerationDataUtil.generateValidPassword());
    }
}
