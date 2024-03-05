package lt.itacademy.java.basics;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {


//        Calculate cube’s volume and perimeter.
//        Input: 5
//        Output:
//        Cube’s volume: 125cm3.
//                Cube’s perimeter: 60cm.

        Scanner scan = new Scanner(System.in);

        System.out.print("Input: ");
        int len = Integer.parseInt(scan.nextLine());

        System.out.println("Cube’s volume: "+len*len*len +"cm3");
        System.out.println("\t Cube’s perimeter: "+len*12+"cm");

        //Task 4
        System.out.println("TASK 4\n");

//        Create a method which converts feet and inches to centimeters. It needs to have two parameters.
//        First parameter is feet and second is inches.
//
//        Hint: 1 inch = 2.54cm and 1 foot = 12 inches
//
//        Input: 2.4 4
//
//        Output: 2.4 feet and 4.0 inches = 83.312 cm

        System.out.print("Input feets: ");
        double feet = Double.parseDouble(scan.nextLine());

        System.out.print("Input inches: ");
        double inches = Double.parseDouble(scan.nextLine());

        converterToCentimeters(feet,inches);

    }
    static void converterToCentimeters (double feet, double inches){
double feetToCm = feet*12*2.54;
double inchesToCm = inches*2.54;
double sum = feetToCm+inchesToCm;
        DecimalFormat df = new DecimalFormat("#.###");
        sum = Double.valueOf(df.format(sum));

        System.out.println("Output: "+feet+" feet and "+inches+" inches = "+sum+" cm");




    }
}
