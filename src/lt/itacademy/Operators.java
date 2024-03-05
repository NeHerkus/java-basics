package lt.itacademy;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

    }

    //-- Task 5 --
    public static String fifthTaskResult(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 triangle sides: ");
        int firstSide = scanner.nextInt();
        int secondSide = scanner.nextInt();
        int thirdSide = scanner.nextInt();

        if (firstSide == secondSide && firstSide == thirdSide) {
            return "Triangle is Equilaretal. Sides: " + firstSide + " " + secondSide + " " + thirdSide;
        } else if (firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide){
            return "Triangle is invalid. Sides: " + firstSide + " " + secondSide + " " + thirdSide;
        } else {
            return "Triangle is invalid: " + firstSide + " " + secondSide + " " + thirdSide;
        }
    }

    //-- Task 6 --
    public static String sixthTaskResult(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distance, fuel left, fuel usage, fuel price: ");
        int destination = scanner.nextInt();
        int fuelLeft = scanner.nextInt();
        int fuelUsage = scanner.nextInt();
        double fuelPrice = scanner.nextDouble();

        int fuelNeeded = (destination / 100) * fuelUsage - fuelLeft;
        if (fuelNeeded <= 0){
            return  "Destination is in " + destination + "km. Car is able to reach the destination. It will have " + fuelNeeded + " of fuel left";
        } else {
            return "Destination is in " + destination + "km. Car is not able to reach the destination. It needs " + (fuelLeft % fuelUsage) + " liter of fuel more. It will cost " + fuelPrice;
        }

    }
}
