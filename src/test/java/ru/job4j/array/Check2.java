package ru.job4j.array;

public class Check2 {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean datum : data) {
            result = data[0];
            if (datum != result) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}