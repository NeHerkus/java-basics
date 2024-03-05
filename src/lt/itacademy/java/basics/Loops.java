package lt.itacademy.java.basics;

import java.util.Scanner;

public class Loops {

     static String convertDaysToHoursAndMinutes(int days) {

        int hours = 0;
        int minutes = 0;

        for (int i = 1; i <= days; i++) {
        hours += 24;

            for (int j = 1; j <= 24; j++) {
                minutes += 60;
            }
        }

        return "There are " + hours + " hours or " + minutes + " minutes in one year.";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number of days");
        int input = scanner.nextInt();
        System.out.println(convertDaysToHoursAndMinutes(input));
    }
}
