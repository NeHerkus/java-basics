package lt.itacademy.java.basics;

import java.util.Scanner;

import static java.lang.System.*;

public class Loops {


    public static void main(String[] args) {
        hoursMinutesInDaysForLoop();
        hoursMinutesInDaysWhileLoop();
    }

    public static void hoursMinutesInDaysForLoop() {
        Scanner scanner = new Scanner(in);
        out.print("Enter days (for loop): ");
        int d = Integer.parseInt(scanner.nextLine());
        int h = 0;
        int m = 0;

        for (int i = 0; i < d; i++) {
            h += 24;
        }

        for (int i = 0; i < h; i++) {
            m += 60;
        }

        out.println("There are " + h + " hours or " + m + " minutes in " + d + "days.");
    }
    public static void hoursMinutesInDaysWhileLoop() {
        Scanner scanner = new Scanner(in);
        out.print("Enter days (while loop): ");
        int d = Integer.parseInt(scanner.nextLine());
        int h = 0;
        int m = 0;
        int i = d;

        while (i > 0) {
            h += 24;
            i--;
        }

        i = h;

        while (i > 0) {
            m += 60;
            i--;
        }

        out.println("There are " + h + " hours or " + m + " minutes in " + d + "days.");
    }
}
