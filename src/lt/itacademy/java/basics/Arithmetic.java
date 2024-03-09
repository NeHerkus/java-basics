package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic
{
    private static final double INCHES_IN_FEET = 12;
    private static final double FEET_TO_CENTIMETERS = 2.54;

    public static void main(String[] args)
    {
        // doTaskThree();
        doTaskFour();
    }

    private static void doTaskThree()
    {
        System.out.println("Please enter cube edge length:");

        var scanner = new Scanner(System.in);
        var rawInput = scanner.nextLine();
        var edgeLength = Integer.parseInt(rawInput);

        int volume = getVolume(edgeLength);
        int perimeter = getPerimeter(edgeLength);

        System.out.println("Cube's volume: " + volume + "cm3.");
        System.out.println("Cube's perimeter: " + perimeter + "cm.");
    }

    private static int getVolume(int input)
    {
        var volume = Math.pow(input, 3);

        return (int) volume;
    }

    private static int getPerimeter(int input)
    {
        return input * 12;
    }

    private static void doTaskFour()
    {
        System.out.println("Please enter feet and inches separated by a space:2.4 2");

        var scanner = new Scanner(System.in);
        var rawInput = scanner.nextLine();
        var inputs = rawInput.split("\\s+");

        if (inputs.length == 2)
        {
            var feet = Double.parseDouble(inputs[0]);
            var inches = Double.parseDouble(inputs[1]);

            var centimeters = convertImperialToMetric(feet, inches);

            System.out.println(feet + " feet and " + inches + " inches = " + centimeters + " cm");
        }
    }

    private static double convertImperialToMetric(double feet, double inches)
    {
        return (feet * INCHES_IN_FEET + inches) * FEET_TO_CENTIMETERS;
    }
}
