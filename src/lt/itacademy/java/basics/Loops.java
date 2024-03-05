package lt.itacademy.java.basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        Task 7 & 8
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        calculateTimeForLoop(days);
        calculateTimeWhileLoop(days);
//        Task 9
        int number = sc.nextInt();
        System.out.println(calculateFactorial(number));
    }

    public static void calculateTimeForLoop(int days) {
        int hours = 0;
        int minutes = 0;
        for (int day = 1; day <= days; day++) {
            hours += 24;
            minutes += 60 * 24;
        }
        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");
    }

    public static void calculateTimeWhileLoop(int days) {
        int hours = 0;
        int minutes = 0;
        while (days > 0) {
            hours += 24;
            minutes += 60 * 24;
            days--;
        }
        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");
    }

    public static long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }
}
