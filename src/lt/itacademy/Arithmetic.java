package lt.itacademy;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        thirdTaskResult();

    }

    //-- Task 3 --
    private static void thirdTaskResult() {
        int CUBE_SIDES = 12;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cube's number: ");
        int input = scanner.nextInt();

        int cubePerimeter = input * CUBE_SIDES;
        int cubeVolume = (int) Math.pow(input, 3);

        String cubeVolResult = "Cube's volume: " + cubeVolume + "cm3";
        String cubePerResult = "Cube's perimeter: " + cubePerimeter + "cm";

        System.out.println(cubeVolResult + "\n" + cubePerResult);
        scanner.close();
    }

    //-- Task 4
    private static void fourthTaskResult(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter feet and inches numbers: ");
        double feet = scanner.nextDouble();
        double inch = scanner.nextDouble();
        double inchToCm = inch * 2.54;
        double feetToCm = feet * 2.54 * 12;

        String result = feet + " feet and " + inch + " inches = " + (inchToCm + feetToCm);
        System.out.println(result);
        scanner.close();
    }
}