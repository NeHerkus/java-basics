package lt.itacademy.java.basics;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 3 numbers with spaces representing triangle sides length");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        System.out.println("Triangle is " + getTriangleType(side1, side2, side3) + ". Sides: " + (int) side1 + " " + (int) side2 + " " + (int) side3);


        System.out.println("Please enter distance");
        double distance = scanner.nextDouble();
        System.out.println("Please enter how much fuel does the car have in the tank");
        double tank = scanner.nextDouble();
        System.out.println("Please enter car fuel usage per 100km");
        double fuelUsage = scanner.nextDouble();
        System.out.println("Please enter fuel price per liter");
        double fuelPrice = scanner.nextDouble();
        System.out.println(carAbilityToDrive(distance, tank, fuelUsage, fuelPrice));
        scanner.close();

    }

    private static String getTriangleType(double side1, double side2, double side3) {

        if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Isosceles";
        } else if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            return "invalid";
        } else {
            return "Scalene";
        }
    }

    private static String carAbilityToDrive(double distance, double tank, double fuelUsage, double fuelPrice) {
        double fuelConsumption = distance * (fuelUsage / 100);
        DecimalFormat df = new DecimalFormat("#.##");

        if (tank >= fuelConsumption) {
            double fuelLeft = tank - fuelConsumption;
            return "Destination is in " + df.format(distance) + "km. Car is able to reach the destination. It will have " + df.format(fuelLeft) + " liters of fuel left.";
        } else {
            double fuelNeeded = fuelConsumption - tank;
            double price = fuelNeeded * fuelPrice;
            return "Destination is in " + df.format(distance) + "km. Car is not able to reach the destination. It needs " + df.format(fuelNeeded) + " liter of fuel more. It will cost " + df.format(price);
        }
    }

}
