package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic {
        final static float CM_IN_INCHES = 2.54f;
        final static int INCHES_IN_FEET = 12;
        final static int NUMBER_OF_CUBE_EDGES = 12;
    public static void main(String[] args) {

        float feet = 0;
        float inches = 0;
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input cubes line number: ");
//        int cubeLineSize = scanner.nextInt();
//        scanner.close();
//
//        System.out.println("Cube's Volume: " + getCubeVolume(cubeLineSize)+ "cm3");
//        System.out.println("Cube's Perimeter: " + getCubePerimeter(cubeLineSize)+ "cm");
        System.out.println("Input value of feet: ");
        feet = scanner.nextFloat();
        System.out.println("Input value of inches: ");
        inches = scanner.nextFloat();
        scanner.close();

        System.out.println(feet + " feet and " + inches + " inches = " + String.format("%.3f",feetAndInchesToCm(feet, inches)) + " cm");


    }
        private static int getCubeVolume(int number){
            return number * number * number;
        }

        private static int getCubePerimeter(int number){
            return NUMBER_OF_CUBE_EDGES * number;
        }

        private static float feetAndInchesToCm(float feet, float inches){
            inches += feet * INCHES_IN_FEET;
            return inches * CM_IN_INCHES;

        }
}
