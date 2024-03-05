package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        float feet;
        float inches;
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

        System.out.println(feet + " feet and " + inches + " inches = " + String.format("%.3f",feetAndInchesToCm(feet, inches)) + " cm");


    }
        public static int getCubeVolume(int number){
            return number * number * number;
        }

        public static int getCubePerimeter(int number){
            return 12 * number;
        }

        public static float feetAndInchesToCm(float feet, float inches){
            inches += feet * 12;
            return (float) (inches * 2.54f);

        }
}
