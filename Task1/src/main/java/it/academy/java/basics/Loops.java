package it.academy.java.basics;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        //task7();
        //task8();
        task9();
    }

    public static void task7() {
        int days = 365;
        int hoursADay = 24;
        int minutesADay = 1440;
        int minutes = 0;
        int hours = 0;

        for(int i=0; i<days; i++) {
            hours += hoursADay;
            minutes += minutesADay;
        }

        System.out.printf("There are %d hours or %d minutes in one year.", hours, minutes );
    }

    public static void task8() {
        int days = 365;
        int hoursADay = 24;
        int minutesADay = 1440;
        int minutes = 0;
        int hours = 0;

        int currentDay = 0;
        while (currentDay < days) {
            hours += hoursADay;
            minutes += minutesADay;

            currentDay++;
        }

        System.out.printf("There are %d hours or %d minutes in one year.", hours, minutes );
    }

    public static void task9() {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int factorialNum = 1;

        for(int i=input; i>1; i--) {
            factorialNum *= i;
        }

        System.out.println(factorialNum);
    }
}
