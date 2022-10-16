package com.robonco.javatutorial.generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class ElementCounter {

    static public class OddPredicate implements Predicate<Integer> {

        @Override
        public boolean test(Integer integer) {
            return integer % 2 == 1;
        }
    }

    static public class EvenPredicate implements Predicate<Integer> {

        @Override
        public boolean test(Integer integer) {
            return integer % 2 == 0;
        }
    }


    public static void main(String[] args) {
        Collection<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // ===== test using Lambda =====
        System.out.println("===== test with lambdas =====");
        int oddCount = countElements(list, e -> e % 2 == 1);
        System.out.printf("# Odd values: %d%n", oddCount);

        int evenCount = countElements(list, e -> e % 2 == 0);
        System.out.printf("# Even values: %d%n", evenCount);

        // ===== test using nested classes =====
        System.out.println("===== test with nested Predicate classes");

        oddCount = countElements(list, new OddPredicate());
        evenCount = countElements(list, new EvenPredicate());

        System.out.printf("# Odd values: %d%n", oddCount);
        System.out.printf("# Even values: %d%n", evenCount);

        // ===== test using anonymous classes =====
        System.out.println("===== test with anonymous Predicate classes");

        oddCount = countElements(list, new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i % 2 == 1;
            }
        });

        evenCount = countElements(list, new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i % 2 == 0;
            }
        });

        System.out.printf("# Odd values: %d%n", oddCount);
        System.out.printf("# Even values: %d%n", evenCount);

    }


    public static <T> int countElements(Collection<T> collection, Predicate<T> predicate) {
        int count = 0;

        for (T elem : collection) {
            if (predicate.test(elem)) {
                count++;
            }
        }
        return count;
    }
}
