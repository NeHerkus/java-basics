
void main() {
    System.out.println(determineTriangleType(5, 2, 3));
    System.out.println(checkIfCanReachDestination(100F, 15F, 7.5F, 1.78F));
}

private String determineTriangleType(int sideA, int sideB, int sideC) {

    // there has to be a better way to do this...
    if (!(sideA <= sideB + sideC && sideB <= sideA + sideC && sideC <= sideA + sideB)) {
        return String.format("Triangle is invalid. Sides: %d %d %d", sideA, sideB, sideC);
    } else if (sideA == sideB && sideB == sideC) {
        return String.format("Triangle is equilateral. Sides: %d %d %d", sideA, sideB, sideC);
    } else if ((sideA == sideB) || (sideB == sideC)) {
        return String.format("Triangle is isosceles. Sides: %d %d %d", sideA, sideB, sideC);
    } else {
        return String.format("Triangle is scalene. Sides: %d %d %d", sideA, sideB, sideC);
    }
}

private String checkIfCanReachDestination(float distance, float fuelInTank, float fuelUsage100Km, float fuelPrice) {
    float fuelNeeded = (distance / 100) * (fuelUsage100Km);

    if (fuelNeeded > fuelInTank) {
        float fuelToTopUp = fuelNeeded - fuelInTank;
        float topUpCost = fuelToTopUp * fuelPrice;

        return String.format("""
                Destination is in %.1f km.
                Car is not able to reach the destination.
                It needs %.1f more liters of fuel.
                Additional fuel cost: %.2f
                """, distance, fuelToTopUp, topUpCost);
    } else {
        float fuelLeftAtDest = fuelInTank - fuelNeeded;

        return String.format("""
                Destination is in %.1f km.
                Car is able to reach the destination.
                It will have %.1f liters of fuel left.
                """, distance, fuelLeftAtDest);
    }
}

