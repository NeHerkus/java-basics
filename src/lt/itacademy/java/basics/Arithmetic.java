package lt.itacademy.java.basics;

public class Arithmetic {
    public static void main(String[] args) {

        int border = 5;
        int volume = border * border * border;
        int perimeter = border * 12;
        System.out.println("Cubes volume: " + volume + "cm3");
        System.out.println("Cubes perimeter: " + perimeter + "cm");

        double feet = 2.4;
        double inches = 4.0;

        double convertInchToCm = inches * 2.54;
        double convertFeetToCm = (feet * 12) * 2.54;
        double total = convertInchToCm + convertFeetToCm;

        System.out.println(feet + " feet and " + inches + " inches = " + total + " cm");




    }
}
