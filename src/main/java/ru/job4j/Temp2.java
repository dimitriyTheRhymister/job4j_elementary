package ru.job4j;

public class Temp2 {
    public static void main(String[] args) {
//        calc(6);
//        calc(5);
        calc(3);
        String text = "Smith Will";
        char[] array = text.toCharArray();
        System.out.println(array);
        for (char coin : array) {
            System.out.print(coin + " ");
        }
        System.out.println('A' + 'B');
        int[] numbs = {1, 2, 3, 4, 5, 6, 7};
//        int[] newArray = Arrays.copyOf(numbs, 5);
        int[] newArray = new int[5];
        System.arraycopy(numbs, 0, newArray, 0, 5);
        for (int num : newArray) {
            System.out.print(num + " ");
        }
        for (int num : numbs) {
            System.out.print(num + num + " ");
        }
//        String a = new String();
        int[] a = new int[0];
        System.out.println();
        System.out.println(a.length);
    }

    public static void calc(int n) {
        int hold = 0;
        for (int index = 1; index <= n; index++) {
            hold += index;
            System.out.println(hold);
            if (hold == n) {
                System.out.println("N = " + n + " " + hold + ". Success");
                break;
            } else if (hold > n) {
                System.out.println("N = " + n + " " + hold + ". Not possible");
                break;
            }
        }
    }
}
