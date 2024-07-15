package org.example;

import java.util.stream.Stream;

public class LinearCongruentialGenerator {
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11;
        long m = (long) Math.pow(2, 48);
        long seed = System.currentTimeMillis();
        Stream<Long> randomNumbers = generateRandomStream(seed, a, c, m);
        randomNumbers.limit(10).forEach(System.out::println);
    }

    public static Stream<Long> generateRandomStream(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}