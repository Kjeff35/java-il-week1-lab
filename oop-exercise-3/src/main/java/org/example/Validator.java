package org.example;

public class Validator {
    public static <T> boolean validate(T data, ValidatorPredicate<T> criterion) {
        return criterion.validate(data);
    }
}
