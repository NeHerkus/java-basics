package it.academy.java.basics;

import java.util.Scanner;

public class Arithmetic {

    static void task3(){
        Scanner scanner = new Scanner(System.in);

        double input = scanner.nextDouble();

        double volume = Math.pow(input, 3);
        double perimeter = input * 12;

        System.out.printf("Cube's volume: %.0fcm³.\n", volume);
        System.out.printf("Cube's perimeter: %.0fcm.\n", perimeter);
    }

    static void task4(){
        Scanner scanner = new Scanner(System.in);

        double feet = scanner.nextDouble();
        double inches = scanner.nextDouble();

        double totalInches = feet * 12 + inches;
        double cm = totalInches * 2.54;

        System.out.printf("%.1f feet and  %.1f inches = %.3f cm.\n", feet, inches, cm);

    }
    public static void main(String[] args) {

        //Task 3
        //task3();

        //Task 4
        task4();

    }
}

