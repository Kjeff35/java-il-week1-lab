package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ValidatorPredicate<Integer> isPositivePredicate = n -> n > 0;
        ValidatorPredicate<String> isNonEmptyPredicate = str -> str != null && !str.isEmpty();
        ValidatorPredicate<Double> isInRangePredicate =  v -> v >= 5.0 && v <= 10.0;
        ValidatorPredicate<List<String>> hasDataPredicate = list -> !list.isEmpty();

        System.out.println(Validator.validate(10, isPositivePredicate));
        System.out.println(Validator.validate("Hello World", isNonEmptyPredicate));
        System.out.println(Validator.validate(1.3, isInRangePredicate));
        System.out.println(Validator.validate(List.of("Hello", "World"), hasDataPredicate));
    }
}