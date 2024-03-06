package lt.itacademy.java.basics;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the figure name and dimensions (e.g., Rectangle 5 7): ");
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");

            if (tokens.length < 3) {
                System.out.println("Invalid input format. Please enter the figure name and dimensions.");
                continue;
            }

            String figureName = tokens[0];
            double length, width;

            try {
                length = Double.parseDouble(tokens[1]);
                width = Double.parseDouble(tokens[2]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input format. Please enter numeric values for dimensions.");
                continue;
            }

            switch (figureName.toLowerCase()) {
                case "triangle":
                    double triangleArea = 0.5 * length * width;
                    double trianglePerimeter = length + 2 * Math.sqrt((length * length) / 4 + width * width);
                    System.out.println("Area of the triangle: " + triangleArea);
                    System.out.println("Perimeter of the triangle: " + trianglePerimeter);
                    break;
                case "rectangle":
                    double rectangleArea = length * width;
                    double rectanglePerimeter = 2 * (length + width);
                    System.out.println("Area of the rectangle: " + rectangleArea);
                    System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);
                    break;
                case "square":
                    double squareArea = length * length;
                    double squarePerimeter = 4 * length;
                    System.out.println("Area of the square: " + squareArea);
                    System.out.println("Perimeter of the square: " + squarePerimeter);
                    break;
                default:
                    System.out.println("Invalid figure name. Please enter Triangle, Rectangle, or Square.");
            }

            System.out.print("Do you want to run the calculator again? (yes/no): ");
            String again = scanner.nextLine();
            if (!again.equalsIgnoreCase("yes")) {
                System.out.println("Exiting calculator.");
                break;
            }
        }

        scanner.close();
    }
}
