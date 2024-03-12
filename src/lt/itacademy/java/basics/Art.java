package lt.itacademy.java.basics;

import java.util.Scanner;

public class Art {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printTriangleTree(number);
        sc.close();
    }

    public static void printTriangleTree(int height) {
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
            System.out.println();
        }

        printSpaces(height - 1);
        System.out.println("*");
    }

    private static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    private static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
    }
}
