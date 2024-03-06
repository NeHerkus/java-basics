package org.example;
import java.util.Scanner;

public class Arithmetic {
    private static final double INCHES_TO_CM = 2.54;
    private static final double FEET_TO_INCHES = 12;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side length.");
        double length = scanner.nextDouble();

        double volume = Math.pow(length,3);
        double perimeter = 12*length;

        System.out.printf("Cube’s volume: %.0f cm3.\n", volume);
        System.out.printf("Cube’s perimeter: %.0f cm3.\n", perimeter);

        System.out.println("Enter feet");
        double feet = scanner.nextDouble();

        System.out.println("Enter inches");
        double inches = scanner.nextDouble();

        double centimeters = convertToCentimeters(feet, inches);
        System.out.printf("%.0f feet and %.0f cm3.\n", inches, centimeters);
    }

    private static double convertToCentimeters(double feet, double inches) {
        double totalInches = (feet * FEET_TO_INCHES) + inches;
        double centimeters = totalInches * INCHES_TO_CM;

        return centimeters;
    }
}