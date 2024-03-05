package lt.itacademy.java.basics;

import java.lang.Math;
import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {

        System.out.println("Enter single number: ");
        Scanner scanner = new Scanner(System.in);

        double size = Double.valueOf(scanner.next());

        System.out.println("Volume of the cube is : " + calculateCubeVolume(size) + "\nPerimeter of the cube is: " + calculateCubePerimeter(size));

        scanner.close();


    }
    public static double calculateCubeVolume(double size){
        return Math.pow(size,3);
    }
    public static double calculateCubePerimeter(double size){
        return 12*size;
    }
}
