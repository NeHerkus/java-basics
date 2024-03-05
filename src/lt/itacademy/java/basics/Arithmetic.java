package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic
{
    public static void main(String[] args)
    {
        DoTaskThree();
    }

    private static void DoTaskThree()
    {
        System.out.println("Please enter cube edge length:");

        var scanner = new Scanner(System.in);
        var rawInput = scanner.nextLine();
        var edgeLength = Integer.parseInt(rawInput);

        var volume = GetVolume(edgeLength);
        var perimeter = GetPerimeter(edgeLength);

        System.out.println("Cube's volume: " + volume + "cm3.");
        System.out.println("Cube's perimeter: " + perimeter + "cm.");
    }

    private static int GetVolume(int input)
    {
        var volume = Math.pow(input, 3);

        return (int)volume;
    }

    private static int GetPerimeter(int input)
    {
        return input * 12;
    }
}
