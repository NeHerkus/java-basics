package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic {
    static Scanner sc = new Scanner(System.in);

    public static void cube() {
        System.out.println("Write length of cube's side: ");
        int length = sc.nextInt();
        System.out.println("Cube's volume: " + Math.pow(length, 3) + "cm3");
        System.out.println("Cube's perimeter: " + length * 3 * 4 + "cm");
    }

    public static void main(String[] args) {

        cube();

    }
}
