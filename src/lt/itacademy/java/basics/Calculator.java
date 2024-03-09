package lt.itacademy.java.basics;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Calculator {
    private static final int squareEdges = 4;
    private static final int equalRectangleEdges = 2;
    private static final String edgesValidMessage = "Edges are valid.";
    private static final String edgeEqualsZeroErrorMessage = "%s edge length can’t be less or equal 0.%n";
    private static final String inputInvalidMessage = "Input is invalid.";

    public static void main(String[] args) {
        startCalculator();
    }

    private static void startCalculator() {

        Scanner scanner = new Scanner(in);
        out.print("Enter edges length of square, rectangle or triangle: ");
        String input = scanner.nextLine().trim();
        if (input.isEmpty()) {
            out.println(inputInvalidMessage);
            tryAgain();
        }
        String[] inputArr = input.split(" ");
        int countEdges = inputArr.length;

        if (!checkFigureValid(inputArr, countEdges)) {
            tryAgain();
        }

        switch (countEdges) {
            case 1:
                calculateSquare(Integer.parseInt(inputArr[0]));
                tryAgain();
                break;
            case 2:
                calculateRectangle(Integer.parseInt(inputArr[0]), Integer.parseInt(inputArr[1]));
                tryAgain();
                break;
            case 3:
                calculateTriangle(
                        Double.parseDouble(inputArr[0]),
                        Double.parseDouble(inputArr[1]),
                        Double.parseDouble(inputArr[2])
                );
                tryAgain();
                break;
            default:
                out.println(inputInvalidMessage);
                tryAgain();
        }
    }

    private static boolean checkFigureValid(String[] sides, int count) {
        return switch (count) {
            case 1 -> checkIfSquareSideAreNotZero(Integer.parseInt(sides[0]));
            case 2 -> checkIfRectangleSidesAreNotZero(Integer.parseInt(sides[0]), Integer.parseInt(sides[1]));
            case 3 -> checkIfTriangleSidesAreNotZero(
                    Integer.parseInt(sides[0]),
                    Integer.parseInt(sides[1]),
                    Integer.parseInt(sides[2])
            );
            default -> {
                out.println(inputInvalidMessage);
                yield false;
            }
        };
    }

    private static void tryAgain() {
        Scanner scanner = new Scanner(in);
        out.print("Try again? y/n: ");
        String r = scanner.nextLine();
        if (r.equalsIgnoreCase("y")) {
            startCalculator();
        } else if (r.equalsIgnoreCase("n")) {
            out.println("Closing Scanner...");
            scanner.close();
            out.println("Scanner Closed.");
            System.exit(0);
        } else {
            out.println(inputInvalidMessage);
            tryAgain();
        }
    }

    private static boolean checkIfSquareSideAreNotZero(int squareEdge) {
        if (squareEdge > 0) return true;
        else {
            out.printf(edgeEqualsZeroErrorMessage, "Square");
            return false;
        }
    }

    private static boolean checkIfRectangleSidesAreNotZero(int rectangleEdge1, int rectangleEdge2) {
        if (rectangleEdge1 <= 0 || rectangleEdge2 <= 0) {
            out.printf(edgeEqualsZeroErrorMessage, "Rectangle");
            return false;
        } else return true;
    }

    private static boolean checkIfTriangleSidesAreNotZero(int triangleEdge1, int triangleEdge2, int triangleEdge3) {
        boolean triangleEdgeLengthDontExceedOtherTwoSum =
                (triangleEdge1 + triangleEdge2) > triangleEdge3 &&
                        (triangleEdge1 + triangleEdge3) > triangleEdge2 &&
                        (triangleEdge2 + triangleEdge3) > triangleEdge1;

        if (triangleEdge1 <= 0 || triangleEdge2 <= 0 || triangleEdge3 <= 0) {
            out.printf(edgeEqualsZeroErrorMessage, "Triangle");
            return false;
        } else if (triangleEdgeLengthDontExceedOtherTwoSum) {
            out.println(edgesValidMessage);
            return true;
        } else out.println("Triangle edges length is invalid.");
        return false;
    }

    private static void calculateSquare(int squareEdge) {
        out.printf("Provided figure is square with side of %s.%n", squareEdge);
        out.printf("Square perimeter is %s and area is %s.%n",
                squareEdge * squareEdges,
                squareEdge * squareEdge);
    }

    private static void calculateRectangle(int rectangleEdge1, int rectangleEdge2) {
        out.printf("Provided figure is rectangle with sides of %s and %s.%n",
                rectangleEdge1, rectangleEdge2);
        out.printf("Square perimeter is %s and area is %s.%n",
                (rectangleEdge1 + rectangleEdge2) * equalRectangleEdges,
                rectangleEdge1 * rectangleEdge2);
    }

    private static void calculateTriangle(double triangleEdge1, double triangleEdge2, double triangleEdge3) {
        DecimalFormat decimalFormatArea = new DecimalFormat("#.##");
        DecimalFormat decimalFormatEdges = new DecimalFormat("#");
        double halfPerimeter = (triangleEdge1 + triangleEdge2 + triangleEdge3) / 2;
        double areaTriangle = Math.sqrt(halfPerimeter *
                (halfPerimeter - triangleEdge1) *
                (halfPerimeter - triangleEdge2) *
                (halfPerimeter - triangleEdge3));
        out.printf("Provided figure is triangle with sides of %s %s %s%n",
                decimalFormatEdges.format(triangleEdge1),
                decimalFormatEdges.format(triangleEdge2),
                decimalFormatEdges.format(triangleEdge3));
        out.printf("Triangle perimeter is %s and area is %s.%n",
                decimalFormatEdges.format(triangleEdge1 + triangleEdge2 + triangleEdge3),
                decimalFormatArea.format(areaTriangle));
    }
}
