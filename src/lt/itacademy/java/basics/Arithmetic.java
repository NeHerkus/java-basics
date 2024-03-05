package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic
{
    public static void main(String[] args)
    {
        // DoTaskThree();
        DoTaskFour();
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

    private static void DoTaskFour()
    {
        System.out.println("Please enter feet and inches separated by a space:2.4 2");

        var scanner = new Scanner(System.in);
        var rawInput = scanner.nextLine();
        var inputs = rawInput.split("\\s+");

        if (inputs.length != 2) return;

        var feet = Double.parseDouble(inputs[0]);
        var inches = Double.parseDouble(inputs[1]);

        var centimeters = ConvertImperialToMetric(feet, inches);

        System.out.println(feet + " feet and " + inches + " inches = " + centimeters + " cm");
    }

    private static double ConvertImperialToMetric(double feet, double inches)
    {
        return (feet * 12 + inches) * 2.54;
    }
}
