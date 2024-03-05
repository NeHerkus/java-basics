package lt.itacademy.java.basics;

public class Operators {
    public static void main(String[] args) {

         int side1 = 8;
         int side2 = 8;
         int side3 = 8;

        String triangleType = triangleType(side1, side2, side3);

        System.out.println("Triangle is " + triangleType);

        int distanceToDestination = 100;
        int leftFuel = 6;
        int fuelUsage = 7;
        double fuelPrice = 1.25;

        calculateFuel(distanceToDestination, leftFuel, fuelUsage, fuelPrice);


    }

            public static String triangleType(int side1, int side2, int side3) {

            if (side1 == side2 && side2 == side3 && side1 == side3)
                return "Equilateral";

            else if (side1 == side2 && side2 == side3)
                return "Isosceles";

            else
                return "Scalene";
        }

        public static void calculateFuel(int distanceToDestination, int leftFuel, int fuelUsage, double fuelPrice) {
        double neededFuel = distanceToDestination / 100 * fuelUsage - leftFuel;
        double cost = neededFuel * fuelPrice;

        if (neededFuel <= 0) {
            double fuelLeft = leftFuel - distanceToDestination / 100 * fuelUsage;
            System.out.printf("Destination is in %d km. Car is able to reach the destination. It will have %.1f liters of fuel left.%n", distanceToDestination, leftFuel);
        } else {
            System.out.printf("Destination is in %d km. Car is not able to reach the destination. It needs %.1f liters of fuel more. It will cost %.2f.%n", distanceToDestination, neededFuel, cost);
        }

        }


    }

