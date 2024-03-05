package lt.itacademy.java.basics;

import java.util.Scanner;

public class Art {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int symbols = 1;

        for (int i = input - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= symbols; j++) {
                System.out.print("#");
            }
            symbols += 2;

            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        for (int j = 0; j <= input - 1; j++) {
            System.out.print(" ");
        }

        System.out.print("#");

        for (int j = 0; j <= input - 1; j++) {
            System.out.print(" ");
        }

        System.out.println();
    }

}
