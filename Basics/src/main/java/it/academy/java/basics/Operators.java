package it.academy.java.basics;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        //task5();
        task6();
    }

    public static void task5() {

        Scanner scanner = new Scanner(System.in);

        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        if (side1 <= 0 || side2 <= 0 || side3 <= 0 ||
                side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            System.out.print("Invalid Triangle.");
        } else if (side1 == side2 && side2 == side3) {
            System.out.print("Equilateral Triangle.");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.print("Isosceles Triangle.");
        }else {
            System.out.print("Scalene Triangle.");
        }

        System.out.printf(" Sides: %d %d %d", side1, side2, side3);
    }

    public static void task6() {

        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        int liters = scanner.nextInt();;
        int fuelUsage = scanner.nextInt();
        double literPrice = scanner.nextDouble();

        double litersRequired = distance/100.0 * fuelUsage;

        if(liters < litersRequired){
            double litersToBuy = litersRequired - liters;
            double cost = litersToBuy * literPrice;

            System.out.printf("Destination is in %dkm. Car is not able to reach the destination." +
                    " It needs %.1f liters of fuel more. It will cost %.2f.", distance, litersToBuy, cost);
        }
        else{
            double litersUsed = distance/100.0 * fuelUsage;
            double litersLeft = liters - litersUsed;

            System.out.printf("Destination is in %dkm. Car is able to reach the destination." +
                    " It will have %.1f liters of fuel left.", distance, litersLeft);
        }

    }
}

