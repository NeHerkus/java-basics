package lt.itacademy.java.basics;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Arithmetic {
    private static final int edgesOnCube = 12;
    private static final int inchesPerFoot = 12;
    private static final double oneInchInCm = 2.54;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.print("Enter cube's edge: ");
        int edge = scanner.nextInt();
        out.println("Cube's volume: " + (int) Math.pow(edge, 3) + "cm3");
        out.println("Cube's perimeter: " + edge * edgesOnCube + "cm");

        Scanner scan = new Scanner(in);
        out.print("Enter feet and inches: ");
        String imp = scan.nextLine();
        String[] impArr = imp.split(" ");

        double feet = Double.parseDouble(impArr[0]);
        double inch = Double.parseDouble(impArr[1]);
        out.printf("%s feet and %s inches = %s cm",feet, inch, (inchesPerFoot * feet + inch) * oneInchInCm);
    }
}