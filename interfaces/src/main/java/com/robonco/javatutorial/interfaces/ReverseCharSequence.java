package com.robonco.javatutorial.interfaces;

public class ReverseCharSequence implements CharSequence {
    private final String reversedString;

    public static void main(String[] args) {
        final String TEST_STRING = "Is the following interface valid?";

        ReverseCharSequence rcs = new ReverseCharSequence(TEST_STRING);
        System.out.println("rcs: " + rcs);
        System.out.println("length: " + rcs.length());
        System.out.println("subsequence(7,16): " + rcs.subSequence(7, 16));

        for (int i = 0; i < rcs.length(); i++) {
            System.out.println("charAt(" + i + "): " + rcs.charAt(i));
        }

    }

    public ReverseCharSequence(String aString) {
        this.reversedString = new StringBuilder(aString).reverse().toString();
    }

    @Override
    public int length() {
        return reversedString.length();
    }

    @Override
    public char charAt(int index) {
        return reversedString.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return reversedString.subSequence(start, end);
    }

    @Override
    public String toString() {
        return reversedString;
    }

}
