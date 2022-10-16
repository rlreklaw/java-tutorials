package com.robonco.javatutorial.generics;

import java.util.Arrays;
import java.util.List;

public class MaxElementFinder {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,7,9,8,6,4,2);

        System.out.println(findMaxElement(list, 3, 8));
    }

    public static <T extends Object & Comparable<? super T>> T findMaxElement(List<T> list, int begin, int end) {
        T maxElem = list.get(begin);

        for (int i = begin + 1; i < end; i++) {
            maxElem = list.get(i).compareTo(maxElem) > 0 ? list.get(i) : maxElem;
        }

        return maxElem;
    }
}
