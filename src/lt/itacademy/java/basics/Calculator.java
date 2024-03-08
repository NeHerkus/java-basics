package lt.itacademy.java.basics;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.System.*;

public class Calculator {
    public static void main(String[] args) {
        startCalculator();
    }

    public static void startCalculator() {

        Scanner scanner = new Scanner(in);
        out.print("Enter edges length of square, rectangle or triangle: ");
        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");
        int l = inputArr.length;

        if (!checkFigureValid(inputArr, l)) {
            tryAgain();
        }

        switch(l) {
            case 1:
                int s = Integer.parseInt(inputArr[0]);
                out.println("Provided figure is square with side of " + s);
                out.println("Square perimeter is " + (s * 4) + " and area is " + (s * s) + ".");
                tryAgain();
                break;
            case 2:
                int r1 = Integer.parseInt(inputArr[0]);
                int r2 = Integer.parseInt(inputArr[1]);
                out.println("Provided figure is rectangle with sides of " + r1 + " and " + r2);
                out.println("Square perimeter is " + ((r1 + r2)*2) + " and area is " + (r1 * r2) + ".");
                tryAgain();
                break;
            case 3:
                DecimalFormat df = new DecimalFormat("#.##");
                double t1 = Double.parseDouble(inputArr[0]);
                double t2 = Double.parseDouble(inputArr[1]);
                double t3 = Double.parseDouble(inputArr[1]);
                double p = (t1 + t2 + t3)/2;
                double area = Math.sqrt(p*(p-t1)*(p-t2)*(p-t3));
                out.println("Provided figure is triangle with sides of " + t1 + " " + t2 + " and " + t3);
                out.println("Square perimeter is " + (t1 + t2 + t3) + " and area is " + df.format(area) + ".");
                tryAgain();
                break;
            default:
                out.println("Your input is incorrect.");
                tryAgain();
        }
    }

    private static boolean checkFigureValid(String[] sides, int count){
        switch(count) {
            case 1:
                int side = Integer.parseInt(sides[0]);

                if (side <= 0) {
                    out.println("Square edge length can’t be less or equal 0.");
                    return false;
                }
                break;
            case 2:
                int r1 = Integer.parseInt(sides[0]);
                int r2 = Integer.parseInt(sides[1]);
                if (r1 <= 0 || r2<= 0) {
                    out.println("Rectangle edge length can’t be less or equal 0.");
                    return false;
                }
                break;
            case 3:
                int t1 = Integer.parseInt(sides[0]);
                int t2 = Integer.parseInt(sides[1]);
                int t3 = Integer.parseInt(sides[2]);
                if (t1 <= 0 || t2<= 0 || t3 <= 0){
                    out.println("Triangle edge length can’t be less or equal 0.");
                    return false;
                }
                else if (t1 == t2 && t2 == t3) {
                    out.println("Triangle edges length is valid.");
                    return true;
                } else if ((t1 == t2 || t2 == t3 || t1 == t3) &&
                        ((t1 + t2) > t3 && (t1 + t3) > t2 && (t2 + t3 > t1))) {
                    out.println("Triangle edges length is valid.");
                    return true;
                } else if ((t1 + t2) > t3 && (t1 + t3) > t2 && (t2 + t3 > t1)) {
                    out.println("Triangle edges length is valid.");
                    return true;
                } else out.println("Triangle edges length is invalid.");
                return false;
        }
        out.println("Figure is valid.");
        return true;
    }

    private static void tryAgain() {
        Scanner scanner = new Scanner(in);
        out.print("Try again? y/n: ");
        String r = scanner.nextLine();
        if (r.equalsIgnoreCase("y")) {
            startCalculator();
        } else if (r.equalsIgnoreCase("n")) {
            exit(0);
        } else {
            out.println("Wrong input.");
            tryAgain();
        }
    }
}
