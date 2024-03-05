package lt.itacademy.java.basics;

import java.util.Scanner;

public class Operators {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first side: ");
        int firstSide = Integer.parseInt(scan.nextLine());

        System.out.println("Enter second side: ");
        int secondSide = Integer.parseInt(scan.nextLine());

        System.out.println("Enter third side: ");
        int thirdSide = Integer.parseInt(scan.nextLine());

        System.out.println(triangle(firstSide, secondSide, thirdSide));

//        Program has four parameters: distance to the destination,
//        how much fuel does the car have in the tank, car fuel usage per 100km and fuel price per liter.

        System.out.println("Enter distance to the destination: ");
        int distanceToDestination = Integer.parseInt(scan.nextLine());

        System.out.println("Enter how much fuel does the car have in the tank: ");
        int fuelInTheTank = Integer.parseInt(scan.nextLine());

        System.out.println("Enter car fuel usage per 100km: ");
        int fuelUsagePer100km = Integer.parseInt(scan.nextLine());

        System.out.println("Enter fuel price per liter: ");
        double fuelPricePerLiter = Double.parseDouble(scan.nextLine());

        driveToDestination(distanceToDestination,fuelInTheTank,fuelUsagePer100km,fuelPricePerLiter);
    }

    //task 5
    static String triangle(int firstSide, int secondSide, int thirdSide) {
        if (firstSide + secondSide > thirdSide && secondSide + thirdSide > firstSide && firstSide + thirdSide > secondSide) {
            if (secondSide == thirdSide && firstSide == thirdSide) {
                return "Triangle is Equilateral. Sides: " + firstSide + " " + secondSide + " " + thirdSide;
            } else if (secondSide == thirdSide || firstSide == thirdSide || firstSide == secondSide) {
                return "Triangle is Isosceles. Sides: " + firstSide + " " + secondSide + " " + thirdSide;
            } else {
                return "Triangle is Scalene. Sides: " + firstSide + " " + secondSide + " " + thirdSide;
            }
        }
        return "Triangle is invalid. Sides: " + firstSide + " " + secondSide + " " + thirdSide;
    }

    //task6
    static void driveToDestination(int distanceToDestination, int fuelInTheTank, int fuelUsagePer100km, double fuelPricePerLiter) {
        double fuelLeft = fuelInTheTank - ((double) (distanceToDestination * fuelUsagePer100km) /100);
        System.out.println("liko kuro: " +fuelLeft);
        if (fuelLeft>=0) {
            System.out.println("Destination is in " + distanceToDestination + " km. Car is able to reach the destination. It will have "+ fuelLeft+" liters of\n" +
                    "    fuel left.");

        } else {
            System.out.println("Destination is in  " + distanceToDestination + " km. Car is not able to reach the destination. It needs "+(-1)*fuelLeft+" liter of fuel\n" +
                    "more. It will cost " + (-1)*fuelLeft*fuelPricePerLiter + ".");
        }

    }

}
