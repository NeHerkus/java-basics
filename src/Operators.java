import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float side1 = scanner.nextFloat(),
                side2 = scanner.nextFloat(),
                side3 = scanner.nextFloat();
        determineTriangleType(side1, side2, side3);
        System.out.printf("Sides: %.2f %.2f, %.2f", side1, side2, side3);

    }

    static void determineTriangleType(float side1, float side2, float side3) {
        if (side1 == side2 && side2 == side3) {
            System.out.println("triangle is equilateral");
        }
        else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("triangle is isolesces");
        } else {
            System.out.println("triangle is scalene");
        }
    }
}
