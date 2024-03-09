package lt.itacademy.java.basics;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number of days");
        int input = scanner.nextInt();
        System.out.println(convertDays(input));

        System.out.println("Please enter an integer");
        int integerInput = scanner.nextInt();
        System.out.println(calculateFactorial(integerInput));
        scanner.close();

    }

    private static final int HOURS_IN_A_DAY = 24;
    public static final int MINUTES_IN_AN_HOUR = 60;

    private static String convertDays (int days) {
         int hours = 0;
         int minutes = 0;
         int currentDay = 1;

         while (currentDay <= days) {
             hours += HOURS_IN_A_DAY ;
             minutes += HOURS_IN_A_DAY  * MINUTES_IN_AN_HOUR;
             currentDay++;
         }

        return "There are " + hours + " hours or " + minutes + " minutes in one year.";
    }

    private static String calculateFactorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return String.format("Factorial of number %d is %d", number, factorial);
    }


}
