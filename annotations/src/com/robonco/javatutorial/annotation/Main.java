package com.robonco.javatutorial.annotation;

/**
 * Mares eat oats and does eat oats.
 *
 * @author robert
 */
@Enhancement(
        id = 1,
        synopsis = "Enhancement number one.",
        engineer = "Homer Bodine",
        date = "2022.10.13"
)
@Enhancement(
        id = 2,
        synopsis = "Enhancement number two"
)
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}