package lt.itacademy;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
fifthTaskResult();
    }

    //-- Task 5 --
    public static void fifthTaskResult(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 triangle sides: ");
        int firstSide = scanner.nextInt();
        int secondSide = scanner.nextInt();
        int thirdSide = scanner.nextInt();

        if (firstSide == secondSide && firstSide == thirdSide) {
            System.out.println("Triangle is Equilaretal. Sides: " + firstSide + " " + secondSide + " " + thirdSide);
        } else if (firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide){
            System.out.println("Triangle is Isosceles. Sides: " + firstSide + " " + secondSide + " " + thirdSide);
        } else {
            System.out.println("Triangle is invalid: " + firstSide + " " + secondSide + " " + thirdSide);
        }
    }

    //-- Task 6 --
    public static void sixthTaskResult(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distance, fuel left, fuel usage, fuel price: ");
        int destination = scanner.nextInt();
        int fuelLeft = scanner.nextInt();
        int fuelUsage = scanner.nextInt();
        double fuelPrice = scanner.nextDouble();

        int fuelNeeded = (destination * fuelUsage) / 100 - fuelLeft;
        if (fuelNeeded <= 0){
            System.out.println("Destination is in " + destination + "km. Car is able to reach the destination. It will have " + fuelNeeded + " of fuel left");
        } else {
            System.out.println("Destination is in " + destination + "km. Car is not able to reach the destination. It needs " + (fuelLeft % fuelUsage) + " liter of fuel more. It will cost " + fuelPrice);
        }

    }
}
