package com.robonco.javatutorial.generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class ElementCounter {
   public static void main(String[] args) {
        Collection<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // ===== using Lambda =====
        int oddCount = countElements(list, e -> e % 2 == 1);
        System.out.printf("# Odd values: %d%n", oddCount);

        int evenCount = countElements(list, e -> e % 2 == 0);
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
