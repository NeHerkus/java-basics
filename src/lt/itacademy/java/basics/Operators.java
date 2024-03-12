package lt.itacademy.java.basics;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Operators {
    public static void main(String[] args) {
//        Task 5
        Scanner sc = new Scanner(System.in);
        int firstSide = sc.nextInt();
        int secondSide = sc.nextInt();
        int thirdSide = sc.nextInt();
        System.out.println(calculateTriangle(firstSide, secondSide, thirdSide) + firstSide + " " + secondSide + " " + thirdSide);

//        Task 6

        double distance = sc.nextDouble();
        double fuelInCar = sc.nextDouble();
        double fuelUsage = sc.nextDouble();
        double fuelPricePerLiter = sc.nextDouble();

        boolean isAble = isAbleToDrive(distance, fuelInCar, fuelUsage);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        if (isAble) {
            double fuelLeft = Double.parseDouble(decimalFormat.format(fuelInCar - distance * fuelUsage / 100));
            System.out.println("Destination is in " + distance + "km. Car is able to reach the destination. It will have " +
                    fuelLeft + " liters of fuel left.");
        } else {
            double fuelNeeded = Double.parseDouble(decimalFormat.format(distance * fuelUsage / 100 - fuelInCar));
            double fuelNeededCost = Double.parseDouble(decimalFormat.format(fuelNeeded * fuelPricePerLiter));
            System.out.println("Destination is in " + distance + "km. Car is not able to reach the destination. It needs " +
                    fuelNeeded + " liters of fuel more. " + "It will cost " + fuelNeededCost + ".");
        }
        sc.close();
    }

    public static String calculateTriangle(int firstSide, int secondSide, int thirdSide) {
        int sumOfFirstSecond = firstSide + secondSide;
        int sumOfSecondThird = thirdSide + secondSide;
        int sumOfFirstThird = firstSide + thirdSide;

        if (sumOfFirstSecond < thirdSide || sumOfSecondThird < firstSide || sumOfFirstThird < secondSide) {
            return "Triangle is invalid. Sides: ";
        }

        if (firstSide == secondSide && secondSide == thirdSide) {
            return "Triangle is Equilateral. Sides: ";
        } else if (firstSide == secondSide || secondSide == thirdSide) {
            return "Triangle is Isosceles. Sides: ";
        } else {
            return "Triangle is Scalene. Sides: ";
        }
    }

    public static boolean isAbleToDrive(double distance, double fuelInCar, double fuelUsage) {
        double carFuelUsage = distance * fuelUsage / 100;
        return fuelInCar >= carFuelUsage;
    }
}

