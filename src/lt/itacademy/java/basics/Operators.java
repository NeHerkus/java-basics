package lt.itacademy.java.basics;

import java.util.Scanner;

class MainOperators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side: ");
        int side1 = sc.nextInt();

        System.out.print("Enter second side: ");
        int side2 = sc.nextInt();

        System.out.print("Enter second side: ");
        int side3 = sc.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("Triangle is Equilateral. Sides: " + side1 + " " + side2 + " " + side3);
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Invalid");
        }
    }
}