package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cube's edge in cm");
        int input = scanner.nextInt();

        double volume = calculateCubesVolume(input);
        int perimeter = calculateCubesPerimeter(input);

        System.out.println("Cube's volume: " + volume);
        System.out.println("Cube's perimeter: " + perimeter);
        System.out.println("Please enter feet and inches");
        double feet = scanner.nextDouble();
        double inches = scanner.nextDouble();
        double cm = convertFeetAndInchesToCm(feet, inches);
        System.out.println(feet + " feet and " + inches + " inches = " + cm + " cm");
        scanner.close();
    }

    private static final double INCHES_TO_CM = 2.54;
    private static final int FEET_TO_INCH = 12;
    private static final int CUBE_EDGES = 12;

    private static double convertFeetAndInchesToCm(double feet, double inches) {
        double feetToInch = feet * FEET_TO_INCH;
        double totalInches = feetToInch + inches;
        return totalInches * INCHES_TO_CM;
    }

    private static int calculateCubesPerimeter(int input) {
        return input * CUBE_EDGES;
    }

    private static double calculateCubesVolume(int input) {
        return Math.pow(input, 3);
    }
}
