package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic {

    public static double feetToCentimeters(double feet, double inches) {
        double totalInches = (feet * 12) + inches;
        return totalInches * 2.54;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter side length of the cube: ");
        int sideLength = in.nextInt();

        int volume = sideLength * sideLength * sideLength;
        System.out.println("Cube’s volume: " + volume + "cm3");
        int perimeter = 12 * sideLength;
        System.out.println("Cube’s perimeter: " + perimeter + "cm");

        System.out.print("Enter feet: ");
        double feet = in.nextDouble();
        System.out.print("Enter inches: ");
        double inches = in.nextDouble();

        in.close();

        double centimeters = feetToCentimeters(feet, inches);
        System.out.println(feet + " feet and " + inches + " inches = " + centimeters + " cm");

    }
}
