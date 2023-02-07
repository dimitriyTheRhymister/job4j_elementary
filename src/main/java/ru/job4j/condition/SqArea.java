package ru.job4j.condition;

public class SqArea {
    public static  double square(double p, double k) {
        double height = p / (2 * (k + 1));
        double length = height * k;
        double rectangleArea = height * length;
        return rectangleArea;
    }

    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, rectangleArea = " + result);
    }
}
