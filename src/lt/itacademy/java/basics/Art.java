package lt.itacademy.java.basics;

import java.util.Scanner;

public class Art {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {

            for (int j = 0; j < input - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        for (int i = 0; i < ((2 * input - 1) - 1) / 2; i++) {
            System.out.print(" ");
        }
        System.out.println("#");
    }
}
