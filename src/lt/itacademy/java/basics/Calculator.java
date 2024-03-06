package lt.itacademy.java.basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        boolean useCalculator = true;
        String figure;

        while(useCalculator){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Provide a figure name:");
            figure = scanner.nextLine();
            proceedFigure(figure);

            System.out.println("Do you want to continue to use the calculator? yes - true, no - false");
            useCalculator = scanner.nextBoolean();


        }
        System.out.println("Calculator stopped.");
        scanner.close();

    }



    static Scanner scanner = new Scanner(System.in);


    static boolean isRectangleValid(int edge1, int edge2){
        boolean isValid;

        if(edge1 <= 0 || edge2 <= 0){
            isValid = false;
        } else if (edge1 == edge2) {
            System.out.println("It seems this is a square.");
            calculateSquare();
            isValid = false;
        }else {
            isValid = true;
        }
        return isValid;
    }

    static void calculateRectangle(){
        int edge1;
        int edge2;

        System.out.println("Put the values for two edges of the rectangle:");
        edge1 = scanner.nextInt();
        edge2 = scanner.nextInt();


        if(isRectangleValid(edge1, edge2)){
            int perimeter = (edge1 + edge2) * 2;
            int area = edge1 * edge2;
            System.out.printf("Rectangle perimeter is %d and area is %d.\n", perimeter, area);
        }else {
            System.out.println("Invalid rectangle. Make sure the values for rectangle are not equal or less than zero, or the edges are not equal.");
        }
    }
    static void calculateSquare(){
        int edge1;

        System.out.println("Put a value for the edge of the square:");
        edge1 = scanner.nextInt();

        if (edge1 > 0){
            System.out.printf("Square perimeter is %d and area is %d.\n", edge1 * 4, edge1 * edge1);
        }else {
            System.out.println("Invalid square. Make sure the value for edge is not equal or less than zero.");
        }


    }

    static boolean isTriangleValid(int edge1, int edge2, int edge3){
        boolean isValid;

        if(edge1 <= 0 || edge2 <= 0 || edge3 <= 0){
            isValid = false;
        } else isValid = edge1 + edge2 > edge3 || edge1 + edge3 > edge2 || edge2 + edge3 > edge1;

        return isValid;

    }
    static void calculateTriangle(){
        int edge1;
        int edge2;
        int edge3;

        System.out.println("Put the values of the edges of the triangle:");
        edge1 = scanner.nextInt();
        edge2 = scanner.nextInt();
        edge3 = scanner.nextInt();

        if(isTriangleValid(edge1, edge2, edge3)){
            float semiPerimeter = (float) (edge1 + edge2 + edge3) / 2;
            double area = Math.sqrt(semiPerimeter * (semiPerimeter - edge1) * (semiPerimeter - edge2) * (semiPerimeter - edge3));
            System.out.printf("Triangle perimeter is %d and area is %.2f.\n", (edge1 + edge2 + edge3), area);
        }else {
            System.out.println("Invalid triangle. Make sure edges are not equal or less than zero.");
        }
    }

    static void proceedFigure(String figure){
        switch (figure.toLowerCase()){
            case "triangle":
                calculateTriangle();
                break;
            case "square":
                calculateSquare();
                break;
            case "rectangle":
                calculateRectangle();
                break;
            default:
                System.out.println("Invalid figure has been chosen. Please choose either Triangle, Square or Rectangle");
        }
    }


}
