package org.example;

@FunctionalInterface
public interface ValidatorPredicate<T> {
    boolean validate(T value);
}
