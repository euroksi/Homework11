package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NumberSorter {
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};
        String result = processAndSortNumbers(array);
        System.out.println(result);
    }

    public static String processAndSortNumbers(String[] array) {
        List<Integer> numbers = new ArrayList<>();

        for (String s : array) {
            String[] parts = s.split(",\\s*");
            for (String part : parts) {
                numbers.add(Integer.parseInt(part));
            }
        }
        Collections.sort(numbers);
        return numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}