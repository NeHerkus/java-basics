package lt.itacademy.java.basics;

import java.util.Scanner;

public class Calculator {
    Scanner sc = new Scanner(System.in);

    void main() {
        System.out.println("Geometric shape perimeter and area calculator");
        printMenu();
        processMenuChoice();
    }

    void printMenu() {
        System.out.println("""
          ______________
            Menu:
            1: Triangle
            2: Rectangle
            3: Square
            0: Quit;      
          _______________    
           """);
    }

    void processMenuChoice() {
        int menuChoice = getMenuChoiceInt("Select menu option");

        switch (menuChoice) {
            case 1 -> calculateTriangle();
            case 2 -> calculateRectangle();
            case 3 -> calculateSquare();
            case 0 -> close();
        }
    }

    int getMenuChoiceInt(String msg) {
        System.out.println(msg);
        String userInputString = sc.nextLine();
        int menuChoice;

        try {
            menuChoice = Integer.parseInt(userInputString);
        } catch (NumberFormatException e) {
            return getMenuChoiceInt("Incorrect input. " +
                                         "Enter 1, 2 or 3 to calculate shapes or 0 to quit.");
        }

        if ((menuChoice > 3 || menuChoice < 0)) {
            return getMenuChoiceInt("Incorrect input. " +
                    "Enter 1, 2 or 3 to calculate shapes or 0 to quit.");
        }
        return menuChoice;
    }

    int getShapeSideInt(String msg) {
        System.out.println(msg);
        String userInputString = sc.nextLine();
        int shapeSide;

        try {
            shapeSide = Integer.parseInt(userInputString);
        } catch (NumberFormatException e) {
            return getShapeSideInt("Incorrect input. Enter a positive integer.");
        }

        if (shapeSide <= 0) {
            return getShapeSideInt("Incorrect input. Enter a positive integer.");
        }
        return shapeSide;
    }

    private void calculateTriangle() {
        int sideA = getShapeSideInt("Enter the length of the first side of the triangle");
        int sideB = getShapeSideInt("Enter the length of the second side of the triangle");
        int sideC = getShapeSideInt("Enter the length of the third side of the triangle");

        if (isValidTriangle(sideA, sideB, sideC)) {

            double s = (sideA + sideB + sideC) / 2.0;
            double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));

            System.out.printf("""
                Triangle:
                Side A: %d,   Side B: %d,   Side C: %d
                Perimeter: %d
                Area: %.2f%n
                """, sideA, sideB, sideC, sideA + sideB + sideC, area);
        } else {
            System.out.println("Invalid triangle sides. Enter valid side lengths.");
        }

        printMenu();
        processMenuChoice();
    }

    private boolean isValidTriangle(int sideA, int sideB, int sideC) {
        return sideA <= sideB + sideC && sideB <= sideA + sideC && sideC <= sideA + sideB;
    }

    private void calculateRectangle() {
        int longSide = getShapeSideInt("Enter the length of a rectangle's long side");
        int shortSide = getShapeSideInt("Enter the length of a rectangle's short side");

        if (longSide != shortSide) {
            int perimeter = 2 * (longSide + shortSide);
            int area = longSide * shortSide;

            System.out.printf("""
                Rectangle:
                Long side: %d   Short side: %d
                Perimeter: %d
                Area: %d%n
                """, longSide, shortSide, perimeter, area);
        } else {
            System.out.println("""
               Invalid rectangle.
               The long side and short side are equal.
               The shape is a square.
               """);
        }

        printMenu();
        processMenuChoice();
    }

    private void calculateSquare() {
        int side = getShapeSideInt("Enter the length of a square's side");
        System.out.printf("""
            Square:
            Side: %d
            Perimeter: %d
            Area: %d%n
            """, side, side * 4, side * side);

        printMenu();
        processMenuChoice();
    }

    private void close() {
        System.out.println("Shape calculator closed");
        sc.close();
    }
}
