package lt.itacademy.java.basics;

import java.util.Scanner;

public class Loops {

//     static String convertDaysToHoursAndMinutes(int days) {
//
//        int hours = 0;
//        int minutes = 0;
//
//        for (int i = 1; i <= days; i++) {
//        hours += 24;
//
//            for (int j = 1; j <= 24; j++) {
//                minutes += 60;
//            }
//        }
//
//        return "There are " + hours + " hours or " + minutes + " minutes in one year.";
//    }


    static String convertDays2 (int days) {
         int hours = 0;
         int minutes = 0;
         int day = 1;

         while (day <= days) {
             hours += 24;
             minutes += 24 * 60;
             day++;
         }

        return "There are " + hours + " hours or " + minutes + " minutes in one year.";
    }

    static String calculateFactorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return String.format("Factorial of number %d is %d", number, factorial);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number of days");
        int input = scanner.nextInt();
        System.out.println(convertDays2(input));

        System.out.println("Please enter an integer");
        int integerInput = scanner.nextInt();
        System.out.println(calculateFactorial(integerInput));
    }
}
