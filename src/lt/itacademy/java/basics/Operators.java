package lt.itacademy.java.basics;

import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int side1 = in.nextInt();
        int side2 = in.nextInt();
        int side3 = in.nextInt();

        String triangleType = determineTriangleType(side1, side2, side3);

        System.out.println("Triangle is " + triangleType + ". Sides: " + side1 + " " + side2 + " " + side3);

        determineCar();
        in.close();

    }

    public static String determineTriangleType(double side1, double side2, double side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return "invalid";
        } else if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    public static void determineCar() {
        Scanner in = new Scanner(System.in);

        double distance = in.nextDouble();
        double currentFuel = in.nextDouble();
        double fuelUsagePer100km = in.nextDouble();
        double fuelPricePerLiter = in.nextDouble();

        in.close();

        boolean canReachDestination = canReachDestination(distance, currentFuel, fuelUsagePer100km);

        if (canReachDestination) {
            double remainingFuel = calculateRemainingFuel(distance, currentFuel, fuelUsagePer100km);
            System.out.println("Destination is in " + distance + "km. Car is able to reach the destination. It will have " + remainingFuel + " liters of fuel left.");
        } else {
            double fuelNeeded = calculateFuelNeeded(distance, currentFuel, fuelUsagePer100km);
            double cost = calculateCost(fuelNeeded, fuelPricePerLiter);
            System.out.println("Destination is in " + distance + "km. Car is not able to reach the destination. It needs " + fuelNeeded + " liters of fuel more. It will cost " + cost + ".");
        }
    }

    public static boolean canReachDestination(double distance, double currentFuel, double fuelUsagePer100km) {
        double fuelNeeded = (distance / 100) * fuelUsagePer100km;
        return currentFuel >= fuelNeeded;
    }

    public static double calculateRemainingFuel(double distance, double currentFuel, double fuelUsagePer100km) {
        double fuelNeeded = (distance / 100) * fuelUsagePer100km;
        return currentFuel - fuelNeeded;
    }

    public static double calculateFuelNeeded(double distance, double currentFuel, double fuelUsagePer100km) {
        double fuelNeeded = (distance / 100) * fuelUsagePer100km;
        return fuelNeeded - currentFuel;
    }

    public static double calculateCost(double fuelNeeded, double fuelPricePerLiter) {
        return fuelNeeded * fuelPricePerLiter;
    }
}
