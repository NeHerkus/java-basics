package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic {

    double feet;
    double inch;

    public static double convertInchesToCentimeters(Double inches) {
        return inches * 2.54;
    }

    public static double convertFeetToInches(Double feet) {
        return feet * 12;
    }

    public static double convertFeetAndInchesToCentimeters(Double feet, Double inches) {
        double convertedFeet = convertFeetToInches(feet);
        double allInInches = inches + convertedFeet;
        return convertInchesToCentimeters(allInInches);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert cubes edge length:");
        int length = scanner.nextInt();

        int volume = (int) Math.pow(length, 3);
        int perimeter = length * 12;

        System.out.println("Cube’s volume: " + volume + "cm3.");
        System.out.println("Cube’s perimeter: " + perimeter + "cm.");

        System.out.println("Insert feet and inches:");
        double feet = scanner.nextDouble();
        double inch = scanner.nextDouble();
        double amount = convertFeetAndInchesToCentimeters(feet, inch);

        System.out.println(feet + " feet and " + inch + " inches = " + amount + " cm");

    }
}
