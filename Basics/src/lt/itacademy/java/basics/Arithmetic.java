package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        //create a scanner for inputing values
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the length of the cube: ");
        int length = myObj.nextInt();
        volume(length);
        perimeter(length);

        System.out.println("Enter the feet: ");
        float feet = myObj.nextFloat();
        System.out.println("Enter the inch: ");
        float inch = myObj.nextFloat();
        converter(feet, inch);
    }

    private static void volume(int length) {
        int volume = length * length * length;
        System.out.println(volume + "cm3");
    }
    private static void perimeter(int length) {
        int perimeter = length * 12;
        System.out.println(perimeter + "cm");
    }
    private static void converter(float feet, float inch) {
        float cm = (float) ((feet * 30.48) + (inch * 2.54));
        System.out.println(String.format("%.3fcm", cm) + "cm");
    }
}

