package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        System.out.println("Cube's volume: " + input * input * input + "cm3");
        System.out.println("Cube's perimeter " + input * 12 + "cm");

        scanner.nextLine();
        String[] feetAndInches = scanner.nextLine().split(" ");
        feetAndInchesToCm(Float.parseFloat(feetAndInches[0]), Integer.parseInt(feetAndInches[1]));
    }

    static void feetAndInchesToCm(float feet, int inches) {
        float result = (feet * 12 + inches) * 2.54f;
        System.out.println(feet + " feet and " + inches + " inches = " + result + " cm");
    }
}
