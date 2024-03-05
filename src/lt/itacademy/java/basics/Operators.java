package lt.itacademy.java.basics;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
//        int sideA;
//        int sideB;
//        int sideC;
        float distanceToDestination;
        int fuelInTank;
        int fuelUsagePer100Km;
        float fuelPricePerLitre;


        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write three numbers, that will represent the sides of a triangle:");
//        sideA = scanner.nextInt();
//        sideB = scanner.nextInt();
//        sideC = scanner.nextInt();
//        scanner.close();
//
//        System.out.printf("Triangle is %s. Sides: %d %d %d", getTypeOfTriangle(sideA, sideB, sideC), sideA, sideB, sideC);
        System.out.println(" | Input the values |");
        System.out.println("Distance to the destination:");
        distanceToDestination = scanner.nextFloat();
        System.out.println("Fuel in the tank:");
        fuelInTank = scanner.nextInt();
        System.out.println("Fuel usage per 100km:");
        fuelUsagePer100Km = scanner.nextInt();
        System.out.println("Fuel price per litre:");
        fuelPricePerLitre = scanner.nextFloat();
        scanner.close();

        String result = willTheCarReachDestination(distanceToDestination, fuelInTank, fuelUsagePer100Km, fuelPricePerLitre);
        System.out.println(result);





    }

    public static String getTypeOfTriangle(int sideA, int sideB, int sideC){
        String type;
        if(sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
             return "invalid";
        }

        if(sideA == sideB && sideB == sideC){
            type = "Equilateral";
        } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            type = "Isosceles";
        }else {
            type = "Scalene";
        }
        return type;
    }

    public static String willTheCarReachDestination(float destination, int fuelInTank, int fuelUsage, float fuelPrice){
        float usedFuelForTheTrip = fuelUsage * (destination / 100);
        float fuelNeededForTheTrip = (fuelInTank - usedFuelForTheTrip) * -1;
        String destinationResult;
        if(usedFuelForTheTrip < fuelInTank){
            destinationResult = """
                        Destination is in %.1fkm. Car is able to reach the destination. It will have %.1f litres of fuel left.
                    """.formatted(destination, fuelInTank - usedFuelForTheTrip);
//            System.out.printf("Destination is in %.1fkm. Car is able to reach the destination. It will have %.1f litres of fuel left", destination, fuelInTank - usedFuelForTheTrip);
        }else {
            destinationResult = """
                        Destination is in %.1fkm. Car is not able to reach the destination. It needs %.0f litre of fuel more. It will cost %.2f.
                    """.formatted(destination, fuelNeededForTheTrip, fuelNeededForTheTrip * fuelPrice);
//            System.out.printf("Destination is in %.1fkm. Car is not able to reach the destination. It needs %.0f litre of fuel more. It will cost %.2f.", destination, fuelNeededForTheTrip, fuelNeededForTheTrip * fuelPrice);
        }
        return destinationResult;
    }
}
