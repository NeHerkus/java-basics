package lt.itacademy.java.basics;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    private static final int SIDES_OF_THE_SQUARE = 4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String decision;

        do {
            System.out.print("Enter the shape: ");
            String shape = sc.nextLine().toUpperCase();

            decision = switch (shape) {
                case "RECTANGLE" -> {
                    handleRectangle(sc);
                    yield closeCalculator(sc);
                }
                case "TRIANGLE" -> {
                    handleTriangle(sc);
                    yield closeCalculator(sc);
                }
                case "SQUARE" -> {
                    handleSquare(sc);
                    yield closeCalculator(sc);
                }
                default -> {
                    System.out.println("Please enter a valid shape (Rectangle, Triangle or Square).");
                    yield closeCalculator(sc);
                }
            };
        } while (Objects.equals(decision, "yes"));
    }

    private static void handleRectangle(Scanner sc) {
        System.out.println("Please, enter two rectangle sides.");
        int firstSide = sc.nextInt();
        int secondSide = sc.nextInt();
        sc.nextLine();
        calculateRectangle(firstSide, secondSide);
    }

    private static void handleTriangle(Scanner sc) {
        System.out.println("Please, enter three triangle sides.");
        int firstSideT = sc.nextInt();
        int secondSideT = sc.nextInt();
        int thirdSideT = sc.nextInt();
        sc.nextLine();
        calculateTriangle(firstSideT, secondSideT, thirdSideT);
    }

    private static void handleSquare(Scanner sc) {
        System.out.print("Please, enter square side: ");
        int side = sc.nextInt();
        sc.nextLine();
        calculateSquare(side);
    }

    private static void calculateRectangle(int first, int second) {
        if (first > 0 && second > 0) {
            int perimeter = (first + second) * 2;
            int area = first * second;
            System.out.printf("Rectangle perimeter is %d and area is %d.\n", perimeter, area);
        } else {
            System.out.println("Rectangle edge length can’t be 0 or below.");
        }
    }

    private static void calculateTriangle(int first, int second, int third) {
        if (isValidTriangle(first, second, third)) {
            int perimeter = calculatePerimeter(first, second, third);
            double area = calculateArea(first, second, third);
            displayTriangleProperties(perimeter, area);
        } else {
            displayInvalidTriangle();
        }
    }

    private static boolean isValidTriangle(int first, int second, int third) {
        return first > 0 && second > 0 && third > 0 &&
                first + second > third &&
                second + third > first &&
                first + third > second;
    }

    private static int calculatePerimeter(int... sides) {
        int perimeter = 0;
        for (int side : sides) {
            perimeter += side;
        }
        return perimeter;
    }

    private static double calculateArea(int first, int second, int third) {
        double halfPerimeter = calculatePerimeter(first, second, third) / 2.0;
        return Math.sqrt(halfPerimeter * (halfPerimeter - first) * (halfPerimeter - second) * (halfPerimeter - third));
    }

    private static void displayTriangleProperties(int perimeter, double area) {
        System.out.printf("Triangle perimeter is %d and area is %d.\n", perimeter, (int) area);
    }

    private static void displayInvalidTriangle() {
        System.out.println("Triangle is invalid.");
    }

    private static void calculateSquare(int side) {
        if (side > 0) {
            int perimeter = side * SIDES_OF_THE_SQUARE;
            int area = side * side;
            System.out.printf("Square perimeter is %d and area is %d.\n", perimeter, area);
        } else {
            System.out.println("Square edge length can’t be 0 or below.");
        }
    }

    private static String closeCalculator(Scanner sc) {
        System.out.println("Do you want to run this calculator again? (yes/no)");
        String decision = sc.nextLine();
        return decision.equalsIgnoreCase("yes") ? "yes" : "no";
    }

}
