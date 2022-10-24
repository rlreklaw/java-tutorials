package com.robonco.javatutorial.basic_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileCharCounter {

    private static final String filename = "C:\\Users\\rlrek\\Documents\\projects\\java-tutorials\\basic_io\\src\\main\\data\\xanadu.txt";

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: java FileCharCounter <char>");
            System.exit(666);
        }

        char findChar = args[0].charAt(0);

        int charCount = 0;

        try (BufferedReader inputStream = new BufferedReader(new FileReader(filename))) {
            int c;
            while ((c = inputStream.read()) != -1) {
                if (c == findChar) {
                    charCount ++;
                }
            }
            System.out.printf("Character %s found %d times in file %s%n", findChar, charCount, filename);
        } catch (FileNotFoundException e) {
            System.err.printf("File not found: %s%n", filename);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
