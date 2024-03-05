package lt.itacademy.java.basics;

import java.util.Scanner;

public class Calculator {
    static int perimeter;
    static double area;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("What shape do you want to calculate? ");
            String shape = scanner.nextLine();

            switch (shape) {

                case "Triangle":
                    System.out.println("Enter triangles first side length: ");
                    int one = scanner.nextInt();

                    System.out.println("Enter triangles second side length: ");
                    int two = scanner.nextInt();

                    System.out.println("Enter triangles third side length: ");
                    int three = scanner.nextInt();

                    calculateTriangle(one, two, three);
                    break;

                case "Rectangle":
                    System.out.println("Enter rectangle side length: ");
                    int sideOne = scanner.nextInt();

                    System.out.println("Enter rectangle other side length: ");
                    int sideTwo = scanner.nextInt();

                    calculateRectangle(sideOne, sideTwo);
                    break;

                case "Square":
                    System.out.println("Enter square side length: ");
                    int squareSide = scanner.nextInt();

                    calculateRectangle(squareSide);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.print("Do you want to run the calculator again? (yes/no): ");
            String runAgain = scanner.next();
            running = runAgain.equalsIgnoreCase("yes");
            scanner.nextLine();
        }

        System.out.println("Goodbye!");
        scanner.close();
    }

    public static void calculateRectangle(int sideOne, int sideTwo) {

        if (sideOne > 0 && sideTwo > 0) {
            perimeter = (sideOne + sideTwo) * 2;
            area = sideOne * sideTwo;
            System.out.println("Rectangle perimeter is " + perimeter + " and area is " + area + ".");
        } else if (sideOne == 0 || sideTwo == 0) {
            System.out.println("Rectangle edge length can’t be 0.");
        } else {
            System.out.println("Rectangle side lengths must be positive.");
        }
    }

    public static void calculateRectangle(int squareSide) {

        if (squareSide > 0) {
            perimeter = squareSide * 4;
            area = Math.pow(squareSide, 2);
            System.out.println("Square perimeter is " + perimeter + " and area is " + area + ".");
        } else {
            System.out.println("Square side length must be positive.");
        }
    }

    public static void calculateTriangle(int sideOne, int sideTwo, int sideThree) {
        if (sideOne > 0 && sideTwo > 0 && sideThree > 0) {
            if (sideOne + sideTwo > sideThree && sideOne + sideThree > sideTwo && sideTwo + sideThree > sideOne) {
                perimeter = sideOne + sideTwo + sideThree;
                double half = perimeter / 2;
                area = Math.sqrt(half * (half - sideOne) * (half - sideTwo) * (half - sideThree));
                double roundedArea = Math.round(area * 100.0) / 100.0;

                System.out.println("Triangle perimeter is " + perimeter + " and area is " + roundedArea + ".");
            } else {
                System.out.println("Invalid triangle.");
            }
        } else {
            System.out.println("Triangle side lengths must be positive.");
        }
    }

}
