package lt.itacademy.java.basics;

import java.util.Scanner;

public class Art {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number:");
        int number = scanner.nextInt();

        createArt(number);
    }

    public static void createArt(int number) {

        for (int i = 1; i <= number; i++) {
            int symbolAmount = i * 2 - 1;

            int gaps = number - i;
            for (int j = 0; j < gaps; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < symbolAmount; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
