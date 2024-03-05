package it.academy.java.basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        switch (figure) {
            case "Triangle":
                countTriangle(scanner);
                break;
            case "Rectangle":
                countRectangle(scanner);
                break;
            case "Square":
                countSquare(scanner);
                break;
        }
    }

    private static void countSquare(Scanner scanner) {
        int edge = scanner.nextInt();

        if (edge <= 0) {
            System.out.println("Square edge length can’t be equal or lower than 0.");
            return;
        }

        int area = edge * edge;
        int perimeter = edge * 4;

        System.out.printf("Square perimeter is %d and area is %d.", perimeter, area);
    }

    private static void countRectangle(Scanner scanner) {
        int edge1 = scanner.nextInt();
        int edge2 = scanner.nextInt();

        if (edge1 <= 0 || edge2 <= 0) {
            System.out.println("Triangle edge length can’t be equal or lower than 0.");
            return;
        }

        int area = edge1 * edge2;
        int perimeter = (edge1 + edge2) * 2;

        System.out.printf("Rectangle perimeter is %d and area is %d.", perimeter, area);
    }

    private static void countTriangle(Scanner scanner) {
        int edge1 = scanner.nextInt();
        int edge2 = scanner.nextInt();
        int edge3 = scanner.nextInt();

        if (edge1 <= 0 || edge2 <= 0 || edge3 <= 0) {
            System.out.println("Triangle edge length can’t be equal or lower than 0.");
            return;
        } else if (edge1 + edge2 <= edge3 || edge2 + edge3 <= edge1 || edge1 + edge3 <= edge2) {
            System.out.println("Triangle edges are invalid");
            return;
        }

        int perimeter = edge1 + edge2 + edge3;

        double semiPerimeter = perimeter / 2.0;

        double area = Math.sqrt(semiPerimeter * (semiPerimeter - edge1)
                * (semiPerimeter - edge2) * (semiPerimeter - edge3));

        System.out.printf("semiPerimeter perimeter is %d and area is %.2f.",perimeter, area);
    }
}
