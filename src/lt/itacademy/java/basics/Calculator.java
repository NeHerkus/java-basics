package lt.itacademy.java.basics;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        char input;
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("""
                    1. Triangle
                    2. Rectangle
                    3. Square
                    """);
            System.out.print("Choose a figure from the list. Enter a number: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1: {

                    System.out.println("You selected Triangle. Enter 3 sides of a triangle: ");
                    System.out.println("a: ");

                    int side1;
                    do {
                        side1 = sc.nextInt();

                        if (side1 <= 0) {
                            System.out.println("Input should be a positive integer. Try again.");
                        }
                    } while (side1 <= 0);

                    System.out.println("b: ");
                    int side2;
                    do {
                        side2 = sc.nextInt();

                        if (side2 <= 0) {
                            System.out.println("Input should be a positive integer. Try again.");
                        }
                    } while (side2 <= 0);

                    System.out.println("c: ");
                    int side3;
                    do {
                        side3 = sc.nextInt();

                        if (side3 <= 0) {
                            System.out.println("Input should be a positive integer. Try again.");
                        }
                    } while (side3 <= 0);

                    Triangle(side1, side2, side3);
                    break;
                }

                case 2: {
                    System.out.println("You selected Rectangle. Enter a: ");
                    int a;
                    do {
                        a = sc.nextInt();

                        if (a <= 0) {
                            System.out.println("Input should be a positive integer. Try again.");
                        }
                    } while (a <= 0);

                    System.out.println("b: ");
                    int b;
                    do {
                        b = sc.nextInt();

                        if (b <= 0) {
                            System.out.println("Input should be a positive integer. Try again.");
                        }
                    } while (b <= 0);

                    Rectangle(a, b);
                    break;
                }

                case 3: {
                    System.out.println("You selected Square. Enter a: ");
                    int a;
                    do {
                        a = sc.nextInt();

                        if (a <= 0) {
                            System.out.println("Input should be a positive integer. Try again.");
                        }
                    } while (a <= 0);

                    Square(a);
                    break;
                }

                default:
                    System.out.println("Number is not from the list.");
            }

            System.out.println("Do you want to continue using the calculator? (Y/N): ");
            input = sc.next().trim().toUpperCase().charAt(0);

        } while (input == 'Y');
    }

    static void Triangle(int a, int b, int c) {

        int perimeter = a + b + c;
        double s = (double) perimeter / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.printf("""
                Triangle perimeter is %d and area is %s.
                %n""", perimeter, area);
    }

    static void Rectangle(int a, int b) {

        int perimeter = a * 2 + b * 2;
        int area = a * b;

        System.out.printf("""
                Rectangle perimeter is %d and area is %d.
                %n""", perimeter, area);
    }

    static void Square(int a) {

        int perimeter = a * 4;
        int area = a * a;

        System.out.printf("""
                Square perimeter is %d and area is %d.
                %n""", perimeter, area);
    }
}
