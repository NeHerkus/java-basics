package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic {
    public static final double FEET_EQUAL_INCHES = 12;
    public static final double INCHES_EQUAL_CENTIMETERS = 2.54;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Third task
        double number = sc.nextDouble();
        double volume = Math.pow(number, 3);
        double perimeter = number * 12;
        System.out.println("Cube’s volume: " + (int) volume + "cm3");
        System.out.println("Cube’s perimeter: " + (int) perimeter + "cm");

//        Fourth task
        double feet = sc.nextDouble();
        double inches = sc.nextDouble();
        sc.close();
        System.out.println(feet + " feet and " + inches + " inches = " + convertInchesToCentimetres(feet, inches) + " cm");
    }

    private static double convertInchesToCentimetres(double feet, double inches) {
        inches += FEET_EQUAL_INCHES * feet;
        return (inches * INCHES_EQUAL_CENTIMETERS);
    }
}
