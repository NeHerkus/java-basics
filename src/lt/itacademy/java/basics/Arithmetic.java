package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input cubes line number: ");
        int cubeLineSize = scanner.nextInt();
        scanner.close();

        System.out.println("Cube's Volume: " + getCubeVolume(cubeLineSize)+ "cm3");
        System.out.println("Cube's Perimeter: " + getCubePerimeter(cubeLineSize)+ "cm");


    }
        public static int getCubeVolume(int number){
            return number * number * number;
        }

        public static int getCubePerimeter(int number){
            return 12 * number;
        }
}
