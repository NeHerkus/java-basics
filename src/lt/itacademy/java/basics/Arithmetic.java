package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert cubes edge length:");
        int length = scanner.nextInt();

        int volume = (int)Math.pow(length,3);
        int perimeter = length * 12;

        System.out.println("Cube’s volume: " + volume + "cm3.");
        System.out.println("Cube’s perimeter: " + perimeter + "cm.");

    }
}
