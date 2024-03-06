package lt.itacademy.java.basics;
import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter triangle measurements: ");
        int firstMeas = scanner.nextInt();
        int secMeas = scanner.nextInt();
        int thirdMeas = scanner.nextInt();

        if (firstMeas <= 0 || secMeas <= 0 || thirdMeas <= 0 ) {
            System.out.printf("""
                Triangle is invalid. Sides: %s %s %s
                """, firstMeas, secMeas, thirdMeas);
        } else if (firstMeas == secMeas && secMeas == thirdMeas) {
            System.out.printf("""
                Triangle is Equilateral. Sides: %s %s %s
                """, firstMeas, secMeas, thirdMeas);
        } else if (firstMeas == secMeas || secMeas == thirdMeas || firstMeas == thirdMeas) {
            System.out.printf("""
                Triangle is Isosceles. Sides: %s %s %s
                """, firstMeas, secMeas, thirdMeas);
        } else {
            System.out.printf("""
                Triangle is Scalene. Sides: %s %s %s
                """, firstMeas, secMeas, thirdMeas);
        }

        System.out.println("Enter distance to the destination, how much fuel does the car have in the tank, car fuel usage per 100km and fuel price per liter:");
        int destIn = scanner.nextInt();
        int fuelInTank = scanner.nextInt();
        int fuelUsage = scanner.nextInt();
        float fuelPrice = scanner.nextFloat();

        float fuelReq = ((float) destIn / 100) * fuelUsage;

        if (fuelInTank < fuelReq) {
            float fuelNeeded = fuelReq - fuelInTank;
            float cost = fuelNeeded * fuelPrice;
            System.out.printf("""
                Destination is in %d km. Car is not able to reach the destination. It needs %.2f liters of fuel more. It will cost %.2f.
                """, destIn, fuelNeeded, cost);

        } else {
            float fuelLeft = fuelInTank - fuelReq;
            System.out.printf("""
                Destination is in %d km. Car is able to reach the destination. It will have %.2f liters of fuel left.
                """, destIn, fuelLeft);
        }
        scanner.close();
    }
}
