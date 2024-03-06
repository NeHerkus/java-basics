package it.academy.java.basics;

import java.util.Scanner;

public class Art {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            int spaces = height - i;

            // Print spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Print the current row of '#' symbols
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        for (int j = 0; j < height-1; j++) {
            System.out.print(" ");
        }
        System.out.print("#");
    }
}
