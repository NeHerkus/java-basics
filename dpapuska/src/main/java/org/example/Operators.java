package org.example;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first, second, and third triangle sides.");
        String input = scanner.nextLine();
        String[] inputValues = input.split("\\s+");

        int side1 = Integer.parseInt(inputValues[0]);
        int side2 = Integer.parseInt(inputValues[1]);
        int side3 = Integer.parseInt(inputValues[2]);

        String result = determineTriangleType(side1, side2, side3);

        System.out.printf("Triangle is %s. Sides: %d %d %d", result, side1, side2, side3);

        System.out.println("Enter distance, fuel level, fuel usage l/100km, and price per fuel");

        input = scanner.nextLine();
        inputValues = input.split("\\s+");

        int distance = Integer.parseInt(inputValues[0]);
        int fuelLevel = Integer.parseInt(inputValues[1]);
        int fuelUsage = Integer.parseInt(inputValues[2]);
        double fuelPrice = Double.parseDouble(inputValues[3]);

        double requiredFuel = (distance / 100.0) * fuelUsage;

        if (fuelLevel >= requiredFuel) {
            double fuelLeft = fuelLevel - requiredFuel;
            System.out.printf("Desctination is in %d km. Car is able to reach the destination. It will have %.1f liters of fuel left.", distance, fuelLeft);
        } else {
            double fuelNeeded = requiredFuel - fuelLevel;
            double fuelCost = fuelNeeded * fuelPrice;
            System.out.printf("Destination is in %d km. Car is not able to reach the destination. It needs %.1f liter of fuel more. It will cost %.2f", distance, fuelNeeded, fuelCost);
        }
    }

    public static String determineTriangleType(int side1, int side2, int side3) {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            if (side1 == side2 && side2 == side3) {
                return "Equilateral";
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                return "Isosceles";
            } else {
                return "Scalene";
            }
        } else {
            return "Invalid";
        }
    }
}
