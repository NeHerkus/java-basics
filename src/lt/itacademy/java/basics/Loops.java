package lt.itacademy.java.basics;

import java.util.Scanner;

public class Loops
{
    private static final int HOURS_IN_DAY = 24;
    private static final int MINUTES_IN_DAY = 60 * 24;

    public static void main(String[] args)
    {
        // DoTaskEight();
        doTaskNine();
    }

    private static void doTaskNine()
    {
        System.out.println("Enter a number:");

        var scanner = new Scanner(System.in);
        var rawInput = scanner.nextLine();
        var number = Integer.parseInt(rawInput);

        var factorial = 1;
        for (int i = 1; i <= number; i++)
        {
            factorial *= i;
        }

        System.out.println("Factorial of number " + number + " is " + factorial);
    }

    private static void doTaskEight()
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
            hours += HOURS_IN_DAY;
            minutes += MINUTES_IN_DAY;

            i++;
        }

        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");
    }
}
