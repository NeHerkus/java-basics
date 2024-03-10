
private static final int NUM_CUBE_SIDES = 12;
private static final int INCHES_PER_FOOT = 12;
private static final float CM_PER_INCH = 2.54F;


void main() {
    calculateCube(5);
    convertFeetInchCm(2.4F, 4.0F);
}

private void calculateCube(int side) {
    int volume = side * side * side;
    int perimeter = side * NUM_CUBE_SIDES;

    System.out.printf("The cube's volume: %d, perimeter: %d%n", volume, perimeter);
}

private void convertFeetInchCm(float feet, float inches) {
    float feetToInches = feet * INCHES_PER_FOOT;
    float totalCm = (feetToInches + inches) * CM_PER_INCH;

    System.out.printf("%.1f feet and %.1f inches = %.3f cm%n", feet, inches, totalCm);
}
