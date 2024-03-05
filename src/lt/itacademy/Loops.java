package lt.itacademy;

import java.util.Scanner;

public class Loops {


    public static void main(String[] args) {
        System.out.println(ninthTaskResult());
    }

    //-- Task 7 --
    public static String seventhTaskResult() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter days: ");
        int days = scanner.nextInt();

        int totalHours = 0;
        int totalMinutes = 0;

        for (int i = 0; i < days; i++) {
            totalHours += 24;
            totalMinutes += 60 * 24;
        }

        return "There are " + totalHours + " or " + totalMinutes + " minutes in one year";
    }

    //-- Task 8 --
    public static String eighthTaskResult() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter days: ");
        int days = scanner.nextInt();

        int totalHours = 0;
        int totalMinutes = 0;

        int i = 0;
        while (i < days) {
            totalHours += 24;
            totalMinutes += 24 * 60;
            i++;
        }

        return "Total hours: " + totalHours + " or total minutes: " + totalMinutes;
    }

    //-- Task 9 --
    public static String ninthTaskResult(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return "Factorial of " + number + " is " + factorial;
    }

}
