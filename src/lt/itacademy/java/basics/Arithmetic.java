package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sideLength = in.nextInt();

        int volume = sideLength * sideLength * sideLength;
        System.out.println("Cube’s volume: " + volume + "cm3");
        int perimeter = 12 * sideLength;
        System.out.println("Cube’s perimeter: " + perimeter + "cm");
    }

}
