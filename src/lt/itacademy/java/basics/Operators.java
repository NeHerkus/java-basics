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
}
