package org.example;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamUtils {

    public static void main(String[] args) {
        Stream<String> first = Stream.of("A", "B", "C");
        Stream<String> second = Stream.of("1", "2", "3", "4");

        Stream<String> zipped = zip(first, second);
        zipped.forEach(System.out::println);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();

        Iterable<T> iterable = () -> new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return iterator1.hasNext() && iterator2.hasNext();
            }

            @Override
            public T next() {
                T element1 = iterator1.next();
                T element2 = iterator2.next();
                return element1 != null ? element1 : element2;
            }
        };

        return StreamSupport.stream(iterable.spliterator(), false);
    }
}
