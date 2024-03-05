package lt.itacademy;

import java.util.Arrays;
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(thirdTaskResult()));

    }

    //-- Task 3 --
    public static String[] thirdTaskResult() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cube's number: ");
        int input = scanner.nextInt();

        int cubePerimeter = input * 12;
        int cubeVolume = (int) Math.pow(input, 3);

        String cubeVolResult = "Cube's volume: " + cubeVolume + "cm3";
        String cubePerResult = "Cube's perimeter: " + cubePerimeter + "cm";

        return new String[]{cubeVolResult, cubePerResult};
    }

    //-- Task 4
    public static String fourthTaskResult(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter feet and inches numbers: ");
        double feet = scanner.nextDouble();
        double inch = scanner.nextDouble();
        double inchToCm = inch * 2.54;
        double feetToCm = feet * 2.54 * 12;

        String result = feet + " feet and " + inch + " inches = " + (inchToCm + feetToCm);
        return result;
    }
}