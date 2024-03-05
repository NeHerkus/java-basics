package org.example;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter days per year.");
        int daysPerYear = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter integer.");
        int number = Integer.parseInt(scanner.nextLine());

        calculateHoursAndMinutes(daysPerYear);
        calculateFactorialNumber(number);
    }

    public static void calculateFactorialNumber(int number) {
        int answer = 1;
        int oldNumber = number;

        for (int i = 1; i <= oldNumber; i++) {
            answer *= i;
        }

        System.out.printf("Factorial of number %d is %d.", oldNumber, answer);
    }

    public static void calculateHoursAndMinutes(int daysPerYear) {
        int hoursInDay = 24;
        int minutesInHour = 60;

        int totalHoursFor = 0;
        int totalMinutesFor = 0;
        int totalHoursWhile = 0;
        int totalMinutesWhile = 0;

        for (int day = 1; day <= daysPerYear; day++) {
            totalHoursFor += hoursInDay;
            totalMinutesFor += hoursInDay * minutesInHour;
        }
        int day = 1;
        while(day <= daysPerYear) {
            totalHoursWhile += hoursInDay;
            totalMinutesWhile += hoursInDay * minutesInHour;
            day++;
        }

        System.out.printf("There are %d hours or %d minutes in one year.\n", totalHoursFor, totalMinutesFor);
        System.out.printf("There are %d hours or %d minutes in one year.\n", totalHoursWhile, totalMinutesWhile);
    }
}