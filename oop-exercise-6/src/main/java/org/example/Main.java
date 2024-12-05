package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a list of Person objects
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35),
                new Person("David", 16),
                new Person("Eve", 20)
        );

        // Custom comparator to sort by age in descending order
        Comparator<Person> ageComparator = Comparator.comparingInt(Person::getAge).reversed();

        // Process the collection using Stream API
        List<String> processedNames = people.stream()
                .sorted(ageComparator) // Sort by age in descending order
                .filter(person -> person.getAge() >= 20) // Filter people aged 30 or older
                .map(Person::getName) // Transform to names only
                .toList(); // Collect results into a list

        // Print the sorted and filtered names
        System.out.println("Names: " + processedNames);

    }
}