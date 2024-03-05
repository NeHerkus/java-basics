package lt.itacademy.java.basics;

import java.util.Scanner;

public class Loops
{
    public static void main(String[] args)
    {
        System.out.println("Enter days per year:");

        var scanner = new Scanner(System.in);
        var rawInput = scanner.nextLine();
        var daysPerYear = Integer.parseInt(rawInput);

        int hours = 0;
        int minutes = 0;

        int i = 0;
        while (i < daysPerYear)
        {
            hours += 24;
            minutes += 24 * 60;

            i++;
        }

        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");
    }
}
