package lt.itacademy.java.basics;

public class Operators {
    public static void triangle(int sideOne, int sideTwo, int sideThree) {
        String triangleName = "invalid";

        if(sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree) {
            triangleName = "Scalene";
        }

        if(sideOne == sideTwo && sideOne == sideThree) {
            triangleName = "Equilateral";
        }

        System.out.println("Triangle is " + triangleName + ". Sides: " + sideOne + " " + sideTwo + " " + sideThree);
    }

    public static void main(String[] args) {
        triangle(8,8,8);
    }
}
