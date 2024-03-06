package lt.itacademy.java.basics;

public class Operators {
    public static void main(String[] args) {

        checkTriangleValid(5, 5, 5);
        checkTriangleValid(1, 3, 5);
        destination(100, 6, 7, 1.25);
        destination(110, 25, 7, 1.25);
    }
    public static void checkTriangleValid(int sideA, int sideB, int sideC) {
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            System.out.println("Triangle is invalid. Sides: " + sideA + " " + sideB + " " + sideC);
        }
        else {
            checkTriangleType(sideA, sideB, sideC);
        }
    }

    public static void checkTriangleType(int sideA, int sideB, int sideC) {
            if (sideA == sideB && sideB == sideC) {
                System.out.println("Triangle is Equilateral. Sides: " + sideA + " " + sideB + " " + sideC);
            } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
                System.out.println("Triangle is Isosceles. Sides: " + sideA + " " + sideB + " " + sideC);
            } else {
                System.out.println("Triangle is Scalene. Sides: " + sideA + " " + sideB + " " + sideC);
        }
    }

    public static void destination(double distance, double fuelInCar, double fuelConsumption, double fuelPrice) {
        double fuelNeeded = distance * fuelConsumption / 100;
        System.out.print("Destination is in 100km. ");
        if (fuelInCar >= fuelNeeded) {
            System.out.println("Car is able to reach the destination. It will have " + (fuelInCar - fuelNeeded) + " liters of fuel left.");
        } else {
            System.out.println("Car is not able to reach the destination. It needs " + (fuelNeeded - fuelInCar) + " liters of fuel left. It will cost " + (fuelNeeded - fuelInCar) * fuelPrice + ".");
        }
    }
}
