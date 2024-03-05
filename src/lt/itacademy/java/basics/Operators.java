package lt.itacademy.java.basics;

public class Operators {
    public static void triangle(int sideOne, int sideTwo, int sideThree) {
        String triangleName = "invalid";

        if (sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree) {
            triangleName = "Scalene";
        }

        if (sideOne == sideTwo && sideOne == sideThree) {
            triangleName = "Equilateral";
        }

        System.out.println("Triangle is " + triangleName + ". Sides: " + sideOne + " " + sideTwo + " " + sideThree);
    }

    public static void carDestination(int distance, int fuelInTank, int fuelUsage, double fuelPrice) {
        // 110    25/7*100
        boolean distanceReachable = distance < (fuelInTank / fuelUsage * 100);
        float fuelLeft = fuelInTank - (float) distance / 100 * fuelUsage;
        System.out.println("Destination is in " + distance + "km." + " Car is " + (distanceReachable ? "" : "not ") +
                "able to reach the destination. It " +
                (distanceReachable ? "will have " + fuelLeft + " liters of fuel left." :
                        "needs" + Math.abs(fuelLeft) + "liter of fuel more. It will cost " + Math.abs(fuelLeft) * fuelPrice + "."));
    }

    public static void main(String[] args) {
//        triangle(8,8,8);
        carDestination(110, 25, 7, 1.25);
    }

}
