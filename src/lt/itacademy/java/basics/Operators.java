package lt.itacademy.java.basics;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Operators {
    private static final String space = " ";
    private static final String resultMessage = "Triangle is %s. Sides: %s %s %s";

    public static void main(String[] args) {
        triangle();
    }

    private static void triangle() {
        Scanner scanner = new Scanner(in);
        out.print("Enter triangle edges: ");
        String[] edgesArr = scanner.nextLine().trim().split(space);
        scanner.close();
        detectTriangle(Integer.parseInt(edgesArr[0]), Integer.parseInt(edgesArr[1]), Integer.parseInt(edgesArr[2]));
    }

    private static void detectTriangle(int edge1, int edge2, int edge3) {
        boolean oneLessThanOtherTwoSum = (edge1 + edge2) > edge3 && (edge1 + edge3) > edge2 && (edge2 + edge3) > edge1;
        boolean atLeastTwoEdgesEven = edge1 == edge2 || edge2 == edge3 || edge1 == edge3;
        boolean allEdgesEven = edge1 == edge2 && edge2 == edge3;
        if (allEdgesEven) out.printf(resultMessage, "Equilateral", edge1, edge2, edge3);
        else {
            if (atLeastTwoEdgesEven && oneLessThanOtherTwoSum)
                out.printf(resultMessage, "Isosceles", edge1, edge2, edge3);
            else if (oneLessThanOtherTwoSum) out.printf(resultMessage, "Scalene", edge1, edge2, edge3);
            else out.printf(resultMessage, "invalid", edge1, edge2, edge3);
        }
    }
}
