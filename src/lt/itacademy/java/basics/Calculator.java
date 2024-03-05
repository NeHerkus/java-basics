package lt.itacademy.java.basics;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
//        Task 10
        Scanner sc = new Scanner(System.in);
        String decision;
        while (true){
            String shape = sc.nextLine();
            shape = shape.toUpperCase();

            switch (shape) {
                case "RECTANGLE":
                    int firstSide = sc.nextInt();
                    int secondSide = sc.nextInt();
                    sc.nextLine();
                    calculateRectangle(firstSide, secondSide);
                    decision = closeCalculator(sc);
                    break;

                case "TRIANGLE":
                    int firstSideT = sc.nextInt();
                    int secondSideT = sc.nextInt();
                    int thirdSideT = sc.nextInt();
                    sc.nextLine();
                    calculateTriangle(firstSideT, secondSideT, thirdSideT);
                    decision = closeCalculator(sc);
                    break;

                case "SQUARE":
                    int side = sc.nextInt();
                    sc.nextLine();
                    calculateSquare(side);
                    decision = closeCalculator(sc);
                    break;
                default:
                    System.out.println("Please enter a valid shape");
                    decision = closeCalculator(sc);
                    break;
            }
            if (!Objects.equals(decision, "yes")){break;}
        }
    }

    public static void calculateRectangle(int first, int second) {
        if (first > 0 && second > 0) {
            int perimeter = (first + second) * 2;
            int area = first * second;
            System.out.println("Rectangle perimeter is " + perimeter + " and area is " + area + ".");
        } else {
            System.out.println("Rectangle edge length can’t be 0 or below.");
        }
    }

    public static void calculateTriangle(int first, int second, int third) {
        if (first > 0 && second > 0 && third > 0) {
            int sumOfFirstSecond = first + second;
            int sumOfSecondThird = third + second;
            int sumOfFirstThird = first + third;
            if (sumOfFirstSecond < third || sumOfSecondThird < first || sumOfFirstThird < second) {
                System.out.println("Triangle is invalid.");
            }
            else{
                int perimeter = first + second + third;
                double halfPerimeter = (double) (first + second + third) / 2;
                double area = Math.sqrt(halfPerimeter * (halfPerimeter - first) * (halfPerimeter - second) * (halfPerimeter - third));
                System.out.println("Triangle perimeter is " + perimeter + " and area is " + (int) area + ".");
            }
        } else {
            System.out.println("Rectangle edge length can’t be 0 or below.");
        }
    }
    public static void calculateSquare(int side){
        if (side > 0){
            int perimeter = side * 4;
            int area = side * side;
            System.out.println("Square perimeter is " + perimeter + " and area is " + area + ".");
        }
        else{System.out.println("Square edge length can’t be 0 or below.");}
    }

    public static String closeCalculator(Scanner sc){
        System.out.println("Do you want to run this calculator again? (yes/no)");
        String decision = sc.nextLine();
        return decision.equalsIgnoreCase("yes") ? "yes" : "no";
    }

}
