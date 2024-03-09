package lt.itacademy.java.basics;

import java.util.Scanner;

public class Art {
    public static void main(String[] args) {
        tree();

        sc.close();
    }

    private static Scanner sc = new Scanner(System.in);

    private static void tree() {
        System.out.println("How tall will your tree be? Write a natural number:");
        int number = sc.nextInt();
        for (int i = 1; i <= number * 2; i += 2) {
            int padding = (number * 2 - i + 2) / 2;
            System.out.printf("%" + padding + "s%s%" + padding + "s%n", "", "#".repeat(i), "");
        }
        int pad = (number * 2 + 1) / 2;
        System.out.printf("%" + pad + "s%s%" + pad + "s%n", "", "#", "");
    }
}
