package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                if (array[r][c] < 0) {
                    array[r][c] = 0;
                }
            }
        }
        return array;
    }
}