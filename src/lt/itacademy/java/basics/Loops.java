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
}
