package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Name {
    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Emanuel", "Peter", "Luticia", "Max");
        String result = formatNamesWithOddIndices(names);
        System.out.println(result);
    }

    public static String formatNamesWithOddIndices(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 == 1)
                .mapToObj(i -> (i + 1) + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }
}