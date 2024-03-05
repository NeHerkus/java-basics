package org.example;
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side length.");
        double length = scanner.nextDouble();


        double volume = Math.pow(length,3);
        double perimeter = 12*length;

        System.out.println("Cube’s volume: " + volume + "cm3.");
        System.out.println("Cube’s perimeter: " + perimeter + "cm3.");


        System.out.println("Enter feet");
        double feet = scanner.nextDouble();

        System.out.println("Enter inches");
        double inches = scanner.nextDouble();

        double centimeters = ConvertToCentimeters(feet, inches);
        System.out.println(feet + " feet and " + inches + " inches = " + centimeters + " cm1");

    }

    private static double ConvertToCentimeters(double feet, double inches) {
        double inchesToCm = 2.54;
        double feetToInches = 12;

        double totalInches = (feet * feetToInches) + inches;
        double centimeters = totalInches * inchesToCm;

        return centimeters;
    }
}