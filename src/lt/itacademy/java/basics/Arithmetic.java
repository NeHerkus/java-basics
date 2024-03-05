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

    public static void convertToCentimeters() {
        System.out.println("Provide number");
        String st = sc.nextLine();
        String[] numbers = st.split(" ");
        float feet = Float.parseFloat(numbers[0]);
        float inches = Float.parseFloat(numbers[1]);
        double centimeters = (feet * 12 + inches) * 2.54;
        System.out.println(feet + " feet and " + inches + " inches = " + String.format("%.3f", centimeters) + " cm");


    }

    public static void main(String[] args) {
//        cube();
        convertToCentimeters();

    }
}
