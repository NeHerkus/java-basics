package lt.itacademy.java.basics;

import java.util.Scanner;

public class Art {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printTriangleTree(number);
    }

    public static void printTriangleTree(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int l = 1; l <= height; l++) {
            if (l < height) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }

    }
}
