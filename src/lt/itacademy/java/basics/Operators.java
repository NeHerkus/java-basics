package lt.itacademy.java.basics;

public class Operators {
    public static void main(String[] args) {
        triangleType(8, 8, 8);
        triangleType(1, 3, 5);
        triangleType(5, 5, 10);
        reachDestination(110, 25, 7, 1.25);
    }

    private static void triangleType(int side1, int side2, int side3) {
        if (side1 <= side2 + side3 && side2 <= side1 + side3 && side3 <= side2 + side1) {
            if (side1 == side2 && side2 == side3) {
                System.out.printf("Triangle is Equilateral. Sides: %d, %d, %d\n", side1, side2, side3);
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.printf("Triangle is Isosceles. Sides: %d, %d, %d\n", side1, side2, side3);
            }
        } else {
            System.out.printf("Triangle is invalid. Sides: %d, %d, %d\n", side1, side2, side3);
        }
    }

    private static void reachDestination(int dest, int tankLevel, double fuelUsg, double fuelPrice) {
        double fuelLeft = tankLevel - (double) dest / 100 * fuelUsg;
        if (fuelLeft >= 0) {
            System.out.printf("Destination is in %d km. Car is able to reach the destination. It will have %.1f liters of fuel left.\n", dest, fuelLeft);
        } else {
            System.out.printf("Destination is in %d km. Car is not able to reach the destination. It needs %.1f liter of fuel more. It will cost %.2f.\n", dest, (-fuelLeft), (-fuelLeft) * fuelPrice);
        }
    }

}
