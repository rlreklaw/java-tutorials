package com.robonco.javatutorial.classes;

import java.util.function.Function;

public class DataStructure {


    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public static Boolean isEvenIndex(Integer index) {
        return Boolean.valueOf(index %2 == 0);
    }

    public static Boolean isOddIndex(Integer index) {
        return Boolean.valueOf(index %2 == 1);
    }

    public void printEven() {

        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public void print(DataStructureIterator iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public void print(Function<Integer, Boolean> iterator) {
        for (int i=0; i<SIZE; i++) {
            if (iterator.apply(i)) {
                System.out.print(arrayOfInts[i] + " ");
            }
        }
        System.out.println();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> {
    }

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface

    private class EvenIterator implements DataStructureIterator {

        // Start stepping through the array from the beginning
        private int nextIndex = 0;

        public boolean hasNext() {

            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {

            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }

    public static void main(String s[]) {

        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        ds.printEven();

        ds.print(ds.new EvenIterator());

        ds.print(new DataStructureIterator() {
            private int nextIndex = 1;

            public boolean hasNext() {

                // Check if the current element is the last in the array
                return (nextIndex <= SIZE - 1);
            }

            public Integer next() {

                // Record a value of an odd index of the array
                Integer retValue = Integer.valueOf(ds.arrayOfInts[nextIndex]);

                // Get the next odd element
                nextIndex += 2;
                return retValue;
            }
        });

        ds.print(index -> Boolean.valueOf(index % 2 == 0));
        ds.print(index -> Boolean.valueOf(index % 2 == 1));

        ds.print(DataStructure::isEvenIndex);
        ds.print(DataStructure::isOddIndex);
    }
}
