package lt.itacademy.java.basics;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        calculateFigures();
        scanner.close();
    }

    static Scanner scanner = new Scanner(System.in);

    private static int calculateTriangleArea(int side1, int side2, int side3) {
        int s = (side1 + side2 + side3) / 2;
        return (int) Math.round(Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)));
    }

    private static int calculateRectangleArea(int side1, int side2) {
        return side1 * side2;
    }

    private static int calculateSquareArea(int side1) {
        return side1 * side1;
    }

    private static int calculateTrianglePerimeter(int side1, int side2, int side3) {
        return side1 + side2 + side3;
    }

    private static int calculateRectanglePerimeter(int side1, int side2) {
        return (side1 + side2) * 2;
    }

    private static int calculateSquarePerimeter(int side1) {
        return side1 * 4;
    }

    private static boolean checkIfValidFigure(String figure) {
        return figure.equals("rectangle") || figure.equals("triangle") || figure.equals("square");
    }

    private static boolean checkIfValidSquareInputs(int side1) {
        return side1 > 0;
    }

    private static boolean checkIfValidRectangleInputs(int side1, int side2) {
        return side1 > 0 && side2 > 0 && side1 != side2;
    }

    private static boolean checkIfValidTriangleInputs(int side1, int side2, int side3) {
        return (side1 + side2) > side3 && (side2 + side3) > side1 && (side1 + side3) > side2;
    }

    private static boolean checkIfInputIsZeroOrLess(int side) {
        return side <= 0;
    }

    private static void repeat() {
        System.out.println("Do you want to try again? Enter y/n");
        scanner.nextLine();
        String answer = scanner.nextLine().toLowerCase();

        if (answer.equals("y")) {
            calculateFigures();
        } else if (answer.equals("n")) {
            System.out.println("Goodbye");
        }
    }

    private static void calculateFigures() {
        System.out.println("Enter a figure and it's sides length (for triangle - 3 sides, rectangle - 2 sides, square - 1 side)");
        String figureInput = scanner.next().toLowerCase();

        if (!checkIfValidFigure(figureInput)) {
            System.out.println("Invalid figure");
            repeat();
        }

        int side1;
        int side2;
        int side3;

        switch (figureInput) {
            case "triangle":
                side1 = scanner.nextInt();
                side2 = scanner.nextInt();
                side3 = scanner.nextInt();
                if (checkIfInputIsZeroOrLess(side1) ||
                        checkIfInputIsZeroOrLess(side2) ||
                        checkIfInputIsZeroOrLess(side3)) {
                    System.out.println("Invalid input: edge length cannot be 0");
                    repeat();
                }
                if (checkIfValidTriangleInputs(side1, side2, side3)) {
                    System.out.printf("Triangle perimeter is %d and area is %d%n", calculateTrianglePerimeter(side1, side2, side3),
                            calculateTriangleArea(side1, side2, side3));
                    repeat();
                } else {
                    System.out.println("Invalid side inputs for a triangle");
                    repeat();
                }
                break;
            case "rectangle":
                side1 = scanner.nextInt();
                side2 = scanner.nextInt();
                if (checkIfInputIsZeroOrLess(side1) ||
                        checkIfInputIsZeroOrLess(side2)) {
                    System.out.println("Invalid input: edge length cannot be 0");
                    repeat();
                }
                if (checkIfValidRectangleInputs(side1, side2)) {
                    System.out.printf("Rectangle perimeter is %d and area is %d%n", calculateRectanglePerimeter(side1, side2), calculateRectangleArea(side1, side2));
                    repeat();
                } else {
                    System.out.println("Invalid side inputs for a rectangle");
                    repeat();
                }
                break;
            case "square":
                side1 = scanner.nextInt();
                if (checkIfInputIsZeroOrLess(side1)) {
                    System.out.println("Invalid input: edge length cannot be 0");
                    repeat();
                }
                if (checkIfValidSquareInputs(side1)) {
                    System.out.printf("Square perimeter is %d and area is %d%n", calculateSquarePerimeter(side1), calculateSquareArea(side1));
                    repeat();
                } else {
                    System.out.println("Invalid side input for a square");
                    repeat();
                }
                break;
        }
    }


}
