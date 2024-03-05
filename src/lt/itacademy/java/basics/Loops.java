package lt.itacademy.java.basics;

import java.util.Scanner;

public class Loops
{
    public static void main(String[] args)
    {
        // DoTaskEight();
        DoTaskNine();
    }

    private static void DoTaskNine()
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

    private static void DoTaskEight()
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
