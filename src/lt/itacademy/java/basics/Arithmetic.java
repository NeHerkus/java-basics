package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter cube's edge in cm");
        int input = scanner.nextInt();

        double volume = Math.pow(input, 3);
        int perimeter = input * 12;

        System.out.println("Cube's volume: " + volume);
        System.out.println("Cube's perimeter: " + perimeter);
    }
}
