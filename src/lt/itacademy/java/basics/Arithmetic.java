package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        task1(scanner);
        task2(scanner);
    }
    public static double convertInchesAndFeets(double feet, double inches){
        return inches*2.54 + feet*2.54*12;
    }
    public static int getPerimeter(int l){
        return l*12;
    }
    public static int getVolume(int l){
        return l*l*l;
    }

    public static void task1(Scanner scanner){
        System.out.println("Enter the cube edge length");
        int edge = scanner.nextInt();
        System.out.println(" -Cube's volume: " + getVolume(edge)
                + "cm3.\n" + " -Cube's perimeter: " + getPerimeter(edge) + "cm.");
    }
    public static void task2(Scanner scanner){
        System.out.println("Enter the inches and feets: ");
        double feet = Double.parseDouble(scanner.next());
        double inches = Double.parseDouble(scanner.next());
        System.out.println(convertInchesAndFeets(feet,inches) + "cm");
    }


}
