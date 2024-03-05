package lt.itacademy.java.basics;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days per year to calculate? ");
        int days = scanner.nextInt();

        calculate(days);
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
}
