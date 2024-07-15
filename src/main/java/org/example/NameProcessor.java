package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class NameProcessor {
    public static void main(String[] args) {
        // Приклад використання методу
        List<String> names = List.of("Ivan", "Emanuel", "Peter", "Luticia", "Steve");
        List<String> result = processAndSortNames(names);
        System.out.println(result);  // Виведе [STEVE, PETER, MIKE, JOHN, IVAN]
    }

    public static List<String> processAndSortNames(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}