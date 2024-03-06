package lt.itacademy;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.println("Enter the figure and its parameters: ");
            String figure = scanner.next();
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();

            switch (figure.toLowerCase()) {
                case "triangle":
                    if (side1 <= 0 || side2 <= 0) {
                        System.out.println("Must be greater than 0.");
                        break;
                    }
                    double trianglePerimeter = side1 + side2 + Math.sqrt(side1 * side1 + side2 * side2);
                    double triangleArea = 0.5 * side1 * side2;
                    System.out.println("Triangle perimeter is " + trianglePerimeter + " and area is " + triangleArea);
                    break;

                case "rectangle":
                    if (side1 <= 0 || side2 <= 0) {
                        System.out.println("Must be greater than 0.");
                        break;
                    }
                    double rectanglePerimeter = 2 * (side1 + side2);
                    double rectangleArea = side1 * side2;
                    System.out.println("Rectangle perimeter is " + rectanglePerimeter + " and area is " + rectangleArea);
                    break;

                case "square":
                    if (side1 <= 0) {
                        System.out.println("Must be greater than 0.");
                        break;
                    }
                    double squarePerimeter = 4 * side1;
                    double squareArea = side1 * side1;
                    System.out.println("Square perimeter is " + squarePerimeter + " and area is " + squareArea);
                    break;

                default:
                    System.out.println("Invalid figure.");
            }

            System.out.println("Do you want to continue (yes/no)?");
            String input = scanner.next();
            continueCalculation = input.equalsIgnoreCase("yes");
        }

        System.out.println("Calculator closed.");
    }
}
