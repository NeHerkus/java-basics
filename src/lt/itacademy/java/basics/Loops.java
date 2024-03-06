package lt.itacademy.java.basics;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        scanner.close();

        calculateTime(days);
    }

    public static void calculateTime(int daysPerYear) {
        int hours = 0;
        int i = 0;

        while (i < daysPerYear) {
            hours += 24;
            i++;
        }
        int minutes = hours * 60;

        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");
    }

    public static class FactorialCalculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            scanner.close();

            long factorial = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        public static long calculateFactorial(int n) {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
