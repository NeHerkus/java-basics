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
}
