package lt.itacademy.java.basics;

import java.util.Scanner;

public class Operators {
    static String getTriangleType (double side1, double side2, double side3) {

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

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 3 numbers with spaces representing triangle sides length");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        System.out.println("Triangle is " + getTriangleType(side1, side2, side3) + ". Sides: " + (int)side1 + " " + (int)side2 + " " + (int)side3);
    }
}
