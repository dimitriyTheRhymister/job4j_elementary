package ru.job4j.loop;

public class LoopFor2 {
    public static void main(String[] args) {
        int ii = 0;
        boolean result = true;
        for (int i = 0; i <= 5; i++) {
            ii = i;
            System.out.println(i);

            if (ii >= 5) {
                result = false;
            }
        }
        System.out.println("Индекс после цикла равен: " + ii);
        System.out.println("Условие выполнения цикла равно: " + result);

        int index = 10;

        System.out.println("Использование префиксной формы записи!");
        System.out.println("Результат вычисления: " + ++index);
        System.out.println("Значение переменной: " + index);
        System.out.println();
        System.out.println("Использование постфиксной формы записи!");
        System.out.println("Результат вычисления: " + index++);
        System.out.println("Значение переменной: " + index);
    }
}
