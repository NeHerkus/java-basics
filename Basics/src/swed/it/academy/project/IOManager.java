package swed.it.academy.project;

import java.util.Scanner;

public class IOManager {
    static final Scanner scanner = new Scanner(System.in);

    private static int option;
    private static double side1;
    private static double side2;

    public static int getOption() {
        return option;
    }

    public static double getSide1() {
        return side1;
    }

    public static double getSide2() {
        return side2;
    }
    public static void chooseShape() {
        System.out.println("Choose a shape: ");
        System.out.println("1. Square");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        option = scanner.nextInt();
    }

    public static void inputData() throws UnknownShapeException{
        switch (option) {
            case 1:
                System.out.println("Enter the length of the square: ");
                side1 = scanner.nextDouble();
                break;
            case 2:
                System.out.println("Enter the base of the triangle: ");
                side1 = scanner.nextDouble();
                System.out.println("Enter the height of the triangle: ");
                side2 = scanner.nextDouble();
                break;
            case 3:
                System.out.println("Enter the radius of the circle: ");
                side1 = scanner.nextDouble();
                break;
            default:
                scanner.close();
                throw new UnknownShapeException("Unknown shape");
        }
        scanner.close();

    }
    public static void showCalculation(String shapeRep) {
       System.out.println(shapeRep);
    }
}
