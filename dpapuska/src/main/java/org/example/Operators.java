package org.example;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first, second, and third triangle sides.");
        String triangleInput = scanner.nextLine();
        String[] triangleValues = triangleInput.split("\\s+");

        int triangleSide1 = Integer.parseInt(triangleValues[0]);
        int triangleSide2 = Integer.parseInt(triangleValues[1]);
        int triangleSide3 = Integer.parseInt(triangleValues[2]);

        String triangleResult = determineTriangleType(triangleSide1, triangleSide2, triangleSide3);
        System.out.printf("Triangle is %s. Sides: %d %d %d\n", triangleResult, triangleSide1, triangleSide2, triangleSide3);

        System.out.println("Enter distance, fuel level, fuel usage l/100km, and price per fuel");
        String fuelInput = scanner.nextLine();
        String[] fuelValues = fuelInput.split("\\s+");

        int distance = Integer.parseInt(fuelValues[0]);
        int fuelLevel = Integer.parseInt(fuelValues[1]);
        int fuelUsage = Integer.parseInt(fuelValues[2]);
        double fuelPrice = Double.parseDouble(fuelValues[3]);

        double requiredFuel = calculateRequiredFuel(distance, fuelUsage);
        processFuelInformation(distance, fuelLevel, requiredFuel, fuelPrice);
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

    public static double calculateRequiredFuel(int distance, int fuelUsage) {
        return (distance / 100.0) * fuelUsage;
    }

    public static void processFuelInformation(int distance, int fuelLevel, double requiredFuel, double fuelPrice) {
        if (fuelLevel >= requiredFuel) {
            double fuelLeft = fuelLevel - requiredFuel;
            System.out.printf("Destination is in %d km. Car is able to reach the destination. It will have %.1f liters of fuel left.\n", distance, fuelLeft);
        } else {
            double fuelNeeded = requiredFuel - fuelLevel;
            double fuelCost = fuelNeeded * fuelPrice;
            System.out.printf("Destination is in %d km. Car is not able to reach the destination. It needs %.1f liters of fuel more. It will cost %.2f\n", distance, fuelNeeded, fuelCost);
        }
    }
}
