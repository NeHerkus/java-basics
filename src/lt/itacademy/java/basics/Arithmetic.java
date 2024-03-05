

void main () {
    calculateCube(5);

}

void calculateCube(int side) {
    int volume = side * side * side;
    int perimeter = side * 12;

    System.out.println(STR."The cube's volume: \{Integer.toString(volume)}, perimeter:  \{Integer.toString(perimeter)}");
}
