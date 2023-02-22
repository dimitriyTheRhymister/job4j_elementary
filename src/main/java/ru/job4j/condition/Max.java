package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int x, int y, int z) {
        return max(max(x, y), z);
    }

    public static int max(int a, int b, int c, int d) {
        return max(max(a, b), max(c, d));
    }

    public static void main(String[] args) {
        int max2 = Max.max(11, 8);
        System.out.println(max2);
        int max3 = Max.max(11, 8, 15);
        System.out.println(max3);
        int max4 = Max.max(11, 8, 15, 154);
        System.out.println(max4);
    }
}
