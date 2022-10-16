package com.robonco.javatutorial.generics;

import java.util.Arrays;

public class ArrayElementSwapper {

    public static void main(String[] args) {
        String[] array = {
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine",
        };

        swapElements(array, 2, 6);

        System.out.println(Arrays.toString(array));
    }
    static <T> void swapElements(T[] array, int index1, int index2) {
        T tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
