package lt.itacademy.java.basics;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.println("Enter the figure (Triangle, Rectangle, Square):");
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
                    System.out.println("Invalid figure. Please try again.");
            }

            System.out.println("Do you want to continue? (yes/no):");
            String choice = scanner.next();
            continueCalculating = choice.equalsIgnoreCase("yes");
        }
        scanner.close();
    }

    public static void calculateTriangle(Scanner scanner) {
        System.out.println("Enter the base and height of the triangle:");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();

        if (base <= 0 || height <= 0) {
            System.out.println("Error: Base and height must be greater than 0.");
            return;
        }

        double perimeter = base * 3;
        double area = (base * height) / 2;
        System.out.println("Triangle perimeter is " + perimeter + " and area is " + area + ".");
    }

    public static void calculateRectangle(Scanner scanner) {
        System.out.println("Enter the length and width of the rectangle:");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        if (length <= 0 || width <= 0) {
            System.out.println("Error: Length and width must be greater than 0.");
            return;
        }

        double perimeter = 2 * (length + width);
        double area = length * width;
        System.out.println("Rectangle perimeter is " + perimeter + " and area is " + area + ".");
    }

    public static void calculateSquare(Scanner scanner) {
        System.out.println("Enter the side length of the square:");
        double sideLength = scanner.nextDouble();

        if (sideLength <= 0) {
            System.out.println("Error: Side length must be greater than 0.");
            return;
        }

        double perimeter = 4 * sideLength;
        double area = sideLength * sideLength;
        System.out.println("Square perimeter is " + perimeter + " and area is " + area + ".");
    }
}
