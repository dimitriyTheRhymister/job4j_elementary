package ru.job4j;

import java.util.Arrays;

public class Temp3 {
    public static String encode(String in) {
        String res = "";
        char sym = in.charAt(0);
        int count = 1;
        for (int i = 1; i < in.length(); i++) {
            if (in.charAt(i) == sym) {
                count++;
            } else {
                res = getStr(res, sym, count);
                count = 1;
                sym = in.charAt(i);
            }
        }
        return getStr(res, sym, count);
    }

    private static String getStr(String res, char sym, int count) {
        return count == 1 ? res + sym : res + sym + count;
    }

    public static void main(String[] args) {
        String in = "aaabbc";
        System.out.println(encode(in));
        char c1 = '\u0035';
        System.out.println(c1);
    }
}
