package lt.itacademy.java.basics;

public class Arithmetic {
    public static double cmConverter(Float feet, Integer inches){
        double allInches = inches + feet * 12;
        return allInches * 2.54;

    }
    public static void main(String[] args) {
        /*
        int side = 5;
        System.out.println("Volume of cube: " + (int)Math.pow(side,3) + "cm3");
        System.out.println("Perimeter of cube: " + side*12 + "cm" );
         */
        double result = cmConverter(2.4F,4);
        System.out.println(String.format("%.3f", result) + " cm" );
    }
}
