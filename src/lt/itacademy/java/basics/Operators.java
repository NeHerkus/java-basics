void main() {

    System.out.println(determineTriangleType(5, 2, 3));

}

String determineTriangleType(int sideA, int sideB, int sideC) {

    // there has to be a better way to do this...

    if (! (sideA <= sideB + sideC && sideB <= sideA + sideC && sideC <= sideA + sideB)) {
        return String.format("Triangle is invalid. Sides: %d %d %d", sideA, sideB, sideC);
    } else if (sideA == sideB && sideB == sideC) {
        return String.format("Triangle is equilateral. Sides: %d %d %d", sideA, sideB, sideC);
    } else if ( (sideA == sideB) || (sideB == sideC) ) {
        return String.format("Triangle is isosceles. Sides: %d %d %d", sideA, sideB, sideC);
    } else {
        return String.format("Triangle is scalene. Sides: %d %d %d", sideA, sideB, sideC);
    }




}
