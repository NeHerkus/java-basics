package org.example;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the figure (Triangle/Rectangle/Square) and its dimensions:");
            String figure = scanner.next();

            switch (figure.toLowerCase()) {
                case "triangle":
                    calculateTriangle(scanner);
                    break;
                case "rectangle":
                    calculateRectangle(scanner);
                    break;
                case "square":
                    calculateSquare(scanner);
                    break;
                default:
                    System.out.println("Invalid figure. Please choose Triangle, Rectangle, or Square.");
            }

            System.out.println("Do you want to run the calculator again? (yes/no)");
            String runAgain = scanner.next().toLowerCase();
            if (!runAgain.equals("yes")) {
                break;
            }
        }
        scanner.close();
    }

    private static void calculateTriangle(Scanner scanner) {
        System.out.println("Enter the base and height of the triangle:");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();

        if (base <= 0 || height <= 0) {
            System.out.println("Triangle base and height must be greater than 0.");
            return;
        }

        double perimeter = base + 2 * Math.sqrt((base * base + height * height) / 4);
        double area = 0.5 * base * height;

        System.out.printf("Triangle perimeter is %.0f and area is %.0f.\n", perimeter, area);
    }

    private static void calculateRectangle(Scanner scanner) {
        System.out.println("Enter the length and width of the rectangle:");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        if (length <= 0 || width <= 0) {
            System.out.println("Rectangle edge length can't be 0 or negative.");
            return;
        }

        double perimeter = 2 * (length + width);
        double area = length * width;

        System.out.printf("Rectangle perimeter is %.0f and area is %.0f.\n", perimeter, area);
    }

    private static void calculateSquare(Scanner scanner) {
        System.out.println("Enter the side length of the square:");
        double side = scanner.nextDouble();

        if (side <= 0) {
            System.out.println("Square side length can't be 0 or negative.");
            return;
        }

        double perimeter = 4 * side;
        double area = side * side;

        System.out.printf("Square perimeter is %.0f and area is %.0f.\n", perimeter, area);
    }
}