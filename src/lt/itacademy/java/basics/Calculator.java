package lt.itacademy.java.basics;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
//        Task 10
        Scanner sc = new Scanner(System.in);
        String decision = "yes";
        while (Objects.equals(decision, "yes")){
            String shape = sc.nextLine();

            switch (shape.toUpperCase()) {
                case "RECTANGLE":
                    int firstSide = sc.nextInt();
                    int secondSide = sc.nextInt();
                    calculateRectangle(firstSide, secondSide);
                    break;

                case "TRIANGLE":
                    int firstSideT = sc.nextInt();
                    int secondSideT = sc.nextInt();
                    int thirdSideT = sc.nextInt();
                    calculateTriangle(firstSideT, secondSideT, thirdSideT);
                    break;

                case "SQUARE":
                    int side = sc.nextInt();
                    calculateSquare(side);
                    break;
                default:
                    System.out.println("Do you want to run this calculator again? (yes/no)");
                    decision = sc.nextLine();
                    break;
            }

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

}
