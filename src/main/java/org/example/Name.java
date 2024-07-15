package org.example;

import java.util.List;

class Name {
    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Emanuel", "Peter", "Luticia", "Max");
        String result = formatNamesWithOddIndices(names);
        System.out.println(result);
    }

    public static String formatNamesWithOddIndices(List<String> names) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < names.size(); i += 2) {
            if (result.length() > 0) {
                result.append(", ");
            }
            result.append(i).append(". ").append(names.get(i));
        }

        return result.toString();
    }
}