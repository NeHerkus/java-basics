package lt.itacademy.java.basics;

import java.util.Scanner;

import static java.lang.System.*;

public class Loops {
    public static void main(String[] args) {
        hoursMinutesInDays();
    }

    public static void hoursMinutesInDays() {
        Scanner scanner = new Scanner(in);
        out.print("Enter days: ");
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
}
