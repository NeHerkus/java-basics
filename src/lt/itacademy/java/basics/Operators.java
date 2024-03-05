package lt.itacademy.java.basics;

public class Operators {

    public static void triangleType(int side1, int side2, int side3) {
        if (side1 <= side2 + side3 && side2 <= side1 + side3 && side3 <= side2 + side1) {
            if (side1 == side2 && side2 == side3) {
                System.out.printf("Triangle is Equilateral. Sides: %d, %d, %d", side1, side2, side3);
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.printf("Triangle is Isosceles. Sides: %d, %d, %d", side1, side2, side3);
            }
        } else {
            System.out.printf("Triangle is invalid. Sides: %d, %d, %d", side1, side2, side3);
        }
    }

    public static void main(String[] args) {
        triangleType(8, 8, 8);
        triangleType(1, 3, 5);
        triangleType(5, 5, 10);
    }
}
