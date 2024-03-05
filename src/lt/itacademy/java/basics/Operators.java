package lt.itacademy.java.basics;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] edges = scanner.nextLine().split(" ");

        triangleDetermination(Integer.parseInt(edges[0]), Integer.parseInt(edges[1]), Integer.parseInt(edges[2]));

        String[] numbers = scanner.nextLine().split(" ");
        calculateCarTravel(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1]), Integer.parseInt(numbers[2]), Float.parseFloat(numbers[3]));
    }

    static void triangleDetermination(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            if(a == b && a == c) {
                System.out.println("Triangle is Equilateral. Sides: " + a + " " + b + " " + c);
                return;
            } else if (a == b || a == c || c == b) {
                System.out.println("Triangle is Isosceles. Sides: " + a + " " + b + " " + c);
                return;
            } else {
                System.out.println("Triangle is Scalene. Sides: " + a + " " + b + " " + c);
                return;
            }
        }

        System.out.println("Triangle is invalid. Sides: " + a + " " + b + " " + c);
    }

    static void calculateCarTravel(int distance, int fuelInTank, int fuelUsage, float fuelPrice) {
        float fuelUsed = distance / 100f * fuelUsage;
        float moreFuelNeeded = fuelUsed - fuelInTank;

        if(fuelUsed > fuelInTank) {
            System.out.println("Destination is in " + distance + "km. Car is not able to reach the destination. It needs " + moreFuelNeeded + " liter(s) of fuel more. It wil cost " + moreFuelNeeded * fuelPrice);
        } else {
            System.out.println("Destination is in " + distance + "km. Car is able to reach the destination. It will have " + (fuelInTank - fuelUsed) + "liter(s) of fuel left.");
        }
    }
}
