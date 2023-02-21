package ru.job4j.converter;

public class Converter2 {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter2.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter2.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollar.");
    }
}
