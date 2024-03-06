package lt.itacademy.java.basics;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean continuing = true;
        while (true) {
            System.out.println("Choose a shape to calculate (Triangle, Rectangle, Square): ");
            String shape = scan.nextLine();
            while (continuing) {
                if (!shape.equals("Triangle") && !shape.equals("Rectangle") && !shape.equals("Square")) {
                    System.out.println("Invalid choice! Please choose Triangle, Rectangle, or Square.");
                    System.out.println("Choose a shape to calculate (Triangle, Rectangle, Square): ");
                    shape = scan.nextLine();
                } else {
                    continuing = false;
                }
            }

            System.out.println("Enter base: ");
            int base = Integer.parseInt(scan.nextLine());
            System.out.println("Enter height: ");
            int height = Integer.parseInt(scan.nextLine());
            switch (shape.toLowerCase()) {
                case "triangle":
                    System.out.println(triangle(base, height));
                    break;
                case "rectangle":
                    System.out.println(rectangle(base, height));
                    break;
                case "square":
                    System.out.println(square(base, height));
                    break;
                default:
                    System.out.println("Case not found");
                    break;
            }

            System.out.println("Do you want to continue? (yes/no)");
            String question = scan.nextLine();
            if (question.equals("no")) {
                break;
            }
        }
    }

    //    Using what you have learned create a calculator which will calculate figures perimeter and area. You
//    must use switch statement for choosing a figure. Program should run as long as you want to
//    continue using calculator. This means that after calculations are done it must ask if you want to run it
//    again. You must check whether input values are correct if not write an error message that values
//    were incorrect. Calculator must be able to calculate Triangle, Rectangle and Square perimeter
//    and area.
    static String triangle(int base, int height) {
        if (base > 0 && height > 0) {
            DecimalFormat df = new DecimalFormat("#.##");
            double perimeter = Math.sqrt(base * base + height * height) + base + height;
            perimeter = Double.parseDouble(df.format(perimeter));
            int area = base * height / 2;
            return "Triangle perimeter is " + perimeter + " and area is " + area + ".";
        }
        return "Triangle base or height can’t be 0.";
    }

    static String rectangle(int base, int height) {
        if (base > 0 && height > 0) {
            int perimeter = 2 * (base + height);
            int area = base * height;
            return "Rectangle perimeter is " + perimeter + " and area is " + area + ".";
        }
        return "Rectangle edge length can’t be 0.";
    }

    static String square(int base, int height) {
        if (base != height) {
            return "It's not a Square!";
        }
        if (base > 0 && height > 0) {
            int perimeter = 4 * base;
            int area = base * base;
            return "Square perimeter is " + perimeter + " and area is " + area + ".";
        } else return "Square edge length can’t be 0.";
    }


}