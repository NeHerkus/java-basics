package lt.itacademy.java.basics;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert triangle side lengths:");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        whatKindOfTriangle(side1, side2, side3);


        System.out.println("Insert distance that you need to drive:");
        double distance = scanner.nextDouble();

        System.out.println("Insert how much fuel is in the tank:");
        double fuelInTheTank = scanner.nextDouble();

        System.out.println("Insert what is fuel usage in the car:");
        double fuelUsage = scanner.nextDouble();

        System.out.println("Insert what is the price of a fuel liter:");
        double price = scanner.nextDouble();

        willIBeAbleToDrive(distance, fuelUsage, fuelInTheTank, price);
    }

    public static void whatKindOfTriangle(int side1, int side2, int side3) {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("Triangle is Equilateral. Sides: " + side1 + " " + side2 + " " + side3);
            } else if (side1 == side2 || side2 == side3 || side3 == side1) {
                System.out.println("Triangle is Isosceles. Sides: " + side1 + " " + side2 + " " + side3);
            } else if (side1 != side2 && side2 != side3 && side3 != side1) {
                System.out.println("Triangle is Scalene. Sides: " + side1 + " " + side2 + " " + side3);
            }
        } else {
            System.out.println("Triangle is invalid. Sides: " + side1 + " " + side2 + " " + side3);
        }
    }

    public static double howMuchFuelDoYouNeed(double distance, double fuelUsage) {
        return fuelUsage * distance / 100;
    }

    public static double howMuchFuelLeftOrLacks(double distance, double fuelUsage, double fuelInTheTank) {
        return fuelInTheTank - howMuchFuelDoYouNeed(distance, fuelUsage);
    }

    public static double howMuchTheLackOfFuelCosts(double distance, double fuelUsage, double fuelInTheTank, double price) {
        double fuel = howMuchFuelLeftOrLacks(distance, fuelUsage, fuelInTheTank);

        if (fuel < 0) {
            return Math.abs(fuel) * price;
        } else {
            return 0;
        }
    }

    public static void willIBeAbleToDrive(double distance, double fuelUsage, double fuelInTheTank, double price) {
        double fuel = howMuchFuelLeftOrLacks(distance, fuelUsage, fuelInTheTank);

        if (fuel > 0) {
            double fuelLeft = Math.abs(fuel);
            System.out.println("Destination is in " + distance + "km. Car is able to reach the destination. It will have " + fuelLeft + " liters of fuel left.");
        } else {
            double fuelLacks = Math.abs(fuel);
            double priceForFuel = howMuchTheLackOfFuelCosts(distance, fuelUsage, fuelInTheTank, price);
            System.out.println("Destination is in " + distance + "km. Car is not able to reach the destination. It needs " + fuelLacks + " liter of fuel\n" +
                    "more. It will cost " + priceForFuel);
        }

    }
}
