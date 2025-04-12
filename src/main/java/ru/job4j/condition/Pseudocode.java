package ru.job4j.condition;

public class Pseudocode {
    public static void maxNumber(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (c > b) {
                System.out.println(c);
            } else {
                System.out.println(b);
            }
        }
    }

    public static void main(String[] args) {
        Pseudocode.maxNumber(5, 4, 3);
        Pseudocode.maxNumber(4, 6, 3);
        Pseudocode.maxNumber(3, 4, 7);
    }
}
