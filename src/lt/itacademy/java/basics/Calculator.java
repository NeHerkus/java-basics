package lt.itacademy.java.basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        perimeterArea();
    }

    static Scanner sc = new Scanner(System.in);

    public static void rectangle() {
        System.out.println("Write length of one side:");
        double a = sc.nextDouble();
        System.out.println("Write length of another side:");
        double b = sc.nextDouble();
        if (a <= 0 || b <= 0) {
            System.out.println("Rectangle side length can’t be less or equal to zero.");
        } else {
            System.out.printf("Rectangle perimeter is %.2f and area is %.2f.", 2 * a + 2 * b, a * b);
        }
    }

    public static void triangle() {
        System.out.println("Write length of first side:");
        double a = sc.nextDouble();
        System.out.println("Write length of second side:");
        double b = sc.nextDouble();
        System.out.println("Write length  third side:");
        double c = sc.nextDouble();
        if (a <= 0 || b <= 0 || c <= 0 || a > b + c || b > a + c || c > a + b) {
            System.out.println("Invalid triangle values.");
        } else {
            double s = (a + b + c) / 2;
            System.out.printf("Triangle perimeter is %.2f and area is %.2f.", a + b + c, Math.sqrt(s * (s - a) * (s - b) * (s - c)));
        }
    }

    public static void square() {
        System.out.println("Write length square side:");
        double a = sc.nextDouble();
        if (a <= 0) {
            System.out.println("Square side length can’t be less or equal to zero.");
        } else {
            System.out.printf("Square perimeter is %.2f and area is %.2f.", 4 * a, a * a);
        }
    }

    public static void perimeterArea() {
        boolean c = true;
        while (c) {
            System.out.println("Choose a figure: ");
            System.out.println("[1]- Triangle\n[2]- Rectangle\n[3]- Square");
            int a = sc.nextInt();
            switch (a) {
                case 1 -> triangle();
                case 2 -> rectangle();
                case 3 -> square();
                default -> System.out.println("Wrong choice, try again");
            }
            System.out.println("\nI want to calculate again. true/false?");
            c = sc.nextBoolean();
        }
    }
}
