package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
//        cube();
        convertToCentimeters();
        sc.close();
    }

    static Scanner sc = new Scanner(System.in);

    private static void cube() {
        System.out.println("Write length of cube's side: ");
        int length = sc.nextInt();
        System.out.println("Cube's volume: " + Math.pow(length, 3) + "cm3");
        System.out.println("Cube's perimeter: " + length * 3 * 4 + "cm");
    }

    private static void convertToCentimeters() {
        System.out.println("Provide 2 numbers:");
        String st = sc.nextLine();
        String[] numbers = st.split(" ");
        float feet = Float.parseFloat(numbers[0]);
        float inches = Float.parseFloat(numbers[1]);
        final int FEET_TO_INCHES = 12;
        final double INCH_TO_CENTIMETERS = 2.54;
        double centimeters = (feet + FEET_TO_INCHES + inches) * INCH_TO_CENTIMETERS;
        System.out.println(feet + " feet and " + inches + " inches = " + String.format("%.3f", centimeters) + " cm");


    }

}
