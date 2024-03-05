package lt.itacademy.java.basics;

import java.lang.Math;
import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {

        System.out.println("Enter single number: ");
        Scanner scanner = new Scanner(System.in);

        double size = Double.parseDouble(scanner.next());

        String printString = """
        Volume of the cube is : %s , Perimeter of the cube is %s
        """.formatted(calculateCubeVolume(size),calculateCubePerimeter(size));
        System.out.println(printString);

        scanner.close();


    }

    public static double calculateCubeVolume(double size) {
        return Math.pow(size, 3);
    }

    public static double calculateCubePerimeter(double size) {
        return 12 * size;
    }
}
