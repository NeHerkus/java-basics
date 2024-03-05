package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic {

    static double convertFeetAndInchesToCm (double feet, double inches) {
    double feetToInch = feet * 12;
    double totalInches = feetToInch + inches;
    return totalInches * 2.54;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter cube's edge in cm");
        int input = scanner.nextInt();

        double volume = Math.pow(input, 3);
        int perimeter = input * 12;

        System.out.println("Cube's volume: " + volume);
        System.out.println("Cube's perimeter: " + perimeter);

        ///////////

        System.out.println("Please enter feet and inches");
        double feet = scanner.nextDouble();
        double inches = scanner.nextDouble();
        double cm = convertFeetAndInchesToCm(feet, inches);
        System.out.println(feet + " feet and " + inches + " inches = " + cm + " cm");
    }

}
