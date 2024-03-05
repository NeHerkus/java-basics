package lt.itacademy.java.basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("Choose a figure (Triangle, Rectangle, Square)");
            String figure = scanner.nextLine();


            System.out.println("Enter the dimensions (for Triangle - a b c, for Rectangle/Square - side length(s)):");
            String[] inputs = scanner.nextLine().split(" ");
            double[] dimensions = new double[inputs.length];
            boolean correctDimensions = true;

            for (int i = 0; i < inputs.length; i++) {
                dimensions[i] = Double.parseDouble(inputs[i]);
                if (dimensions[i] <= 0) {
                    System.out.println("Invalid input. All dimensions must be positive.");
                    correctDimensions = false;
                }
            }
            if (correctDimensions) {
                switch (figure.toLowerCase()) {
                    case "triangle":
                        if (dimensions.length != 3) {
                            System.out.println("Incorrect number of sides for a triangle.");
                            break;
                        }
                        calculateTriangle(dimensions);
                        break;
                    case "rectangle":
                        if (dimensions.length != 2) {
                            System.out.println("Incorrect number of sides for a rectangle.");
                            break;
                        }
                        calculateRectangle(dimensions[0], dimensions[1]);
                        break;
                    case "square":
                        if (dimensions.length != 1) {
                            System.out.println("Incorrect number of sides for a square.");
                            break;
                        }
                        calculateSquare(dimensions[0]);
                        break;
                    default:
                        System.out.println("Unknown figure type.");
                        break;
                }
            }

            System.out.println("Do you want to continue? (yes/no)");
            continueRunning = "yes".equalsIgnoreCase(scanner.nextLine());
        }
        scanner.close();
        System.out.println("Calculator has been terminated.");
    }

    private static void calculateTriangle(double[] sides) {
        double perimeter = sides[0] + sides[1] + sides[2];
        double s = perimeter / 2;
        double area = Math.sqrt(s * (s - sides[0]) * (s - sides[1]) * (s - sides[2])); // Heron's formula
        System.out.printf("Triangle perimeter is %.2f and area is %.2f.%n", perimeter, area);
    }

    private static void calculateRectangle(double length, double width) {
        double perimeter = 2 * (length + width);
        double area = length * width;
        System.out.printf("Rectangle perimeter is %.2f and area is %.2f.%n", perimeter, area);
    }

    private static void calculateSquare(double side) {
        double perimeter = 4 * side;
        double area = side * side;
        System.out.printf("Square perimeter is %.2f and area is %.2f.%n", perimeter, area);
    }
}
