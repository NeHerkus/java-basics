package lt.itacademy.java.basics;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days per year to calculate? ");
        int days = scanner.nextInt();

        System.out.println("Number to calculate factorial: ");
        int number = scanner.nextInt();

        calculate(days);
        calculateFactorial(number);
    }

    public static void calculate(int days) {
        int hours = 0;
        int minutes = 0;
        int i = 0;

        while (i < days) {
            hours += 24;
            minutes += 1440;
            i++;
        }
        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");
    }

    public static void calculateFactorial(int number) {
        int product = 1;
        for (int i = 1; i <= number; i++) {
            product *= i;
        }
        System.out.println("Factorial of number " + number + " is " + product + ".");
    }
}
