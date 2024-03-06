package lt.itacademy.java.basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the amount of days:");
        int amountOfDays = Integer.parseInt(scanner.next());

        calculateHoursMinutesPerYearFor(amountOfDays);
        calculateHoursMinutesPerYearWhile(amountOfDays);

        System.out.println("\n\nEnter the number you want to have a factorial of:");
        int numberForFactorial = Integer.parseInt(scanner.next());
        calculateFactorial(numberForFactorial);

        scanner.close();
    }

    public static void calculateHoursMinutesPerYearFor(int days) {

        int total_hours = 0;
        int total_minutes = 0;
        for (int i = 0; i != days; i++) {
            total_hours = total_hours + 24;
            total_minutes = total_minutes + 1440;
        }
        System.out.printf("Hours in the amount of days %s and minutes %s \n", total_hours, total_minutes);

    }

    public static void calculateHoursMinutesPerYearWhile(int days) {
        int total_hours = 0;
        int total_minutes = 0;
        int i = 0;
        while (days != i) {

            i++;
            total_hours = total_hours + 24;
            total_minutes = total_minutes + 1440;

        }

        System.out.printf("Hours in the amount of days %s and minutes %s ", total_hours, total_minutes);

    }

    public static void calculateFactorial(int number) {

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.printf("Factorial of number %d is  %d ", number, factorial);
    }
}
