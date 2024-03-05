package lt.itacademy.java.basics;

import java.util.Scanner;


public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shapeName, printString;

        double shapeLength, shapeWidth, shapeHeight;
        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.print("Enter the shape (rectangle, square, triangle): ");
            shapeName = scanner.next().toLowerCase();

            switch (shapeName.toLowerCase()) {
                case "rectangle":

                    System.out.print("Enter the length of the rectangle: ");
                    shapeLength = Double.parseDouble(scanner.next());
                    System.out.print("Enter the width of the rectangle: ");
                    shapeWidth = Double.parseDouble(scanner.next());

                    if (shapeLength <= 0 || shapeWidth <= 0) {
                        System.out.println("Error: Rectangle edge length can't be zero or negative.");
                        break;
                    }

                    double rectanglePerimeter = 2 * (shapeLength + shapeWidth);
                    double rectangleArea = shapeLength * shapeWidth;
                    printString = """
                            Rectangle perimeter is %s and area is %s
                            """.formatted(rectanglePerimeter, rectangleArea);
                    System.out.println(printString);
                    break;

                case "triangle":
                    System.out.print("Enter the length of the triangle's base: ");
                    shapeLength = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    shapeHeight = scanner.nextDouble();

                    if (shapeLength <= 0 || shapeHeight <= 0) {
                        System.out.println("Error: Triangle base length or height can't be zero or negative.");
                        break;
                    }

                    double trianglePerimeter = 3 * shapeLength;
                    double triangleArea = 0.5 * shapeLength * shapeHeight;
                    printString = """
                            Triangle perimeter is %s and area is %s
                            """.formatted(trianglePerimeter, triangleArea);
                    System.out.println(printString);
                    break;

                case "square":
                    System.out.print("Enter the length of a side of the square: ");
                    shapeLength = scanner.nextDouble();

                    if (shapeLength <= 0) {
                        System.out.println("Error: Square side length can't be zero or negative.");
                        break;
                    }

                    double squarePerimeter = 4 * shapeLength;
                    double squareArea = shapeLength * shapeLength;
                    printString = """
                           Square perimeter is %s and area is %s
                            """.formatted(squarePerimeter, squareArea);
                    System.out.println(printString);
                    break;


                default:
                    System.out.println("Incorrect shape provided. Please choose one of the following: rectangle, square, triangle");
                    break;

            }
            System.out.print("Do you want to run the calculator again? (yes/no): ");
            String continueInput = scanner.next().toLowerCase();
            if (!continueInput.equals("yes")) {
                continueCalculation = false;
            }
        }

    }


}
