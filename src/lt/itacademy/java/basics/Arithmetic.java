

void main () {
    calculateCube(5);
    convertFeetInchCm(2.4F, 4.0F);
}

void calculateCube(int side) {
    int volume = side * side * side;
    int perimeter = side * 12;

    System.out.printf("The cube's volume: %d, perimeter: %d%n", volume, perimeter);
}

void convertFeetInchCm(float feet, float inches) {
    float feetToInches = feet * 12;
    float totalCm = (feetToInches + inches) * 2.54F;

    System.out.printf("%.1f feet and %.1f inches = %.3f cm%n", feet, inches, totalCm);
}
