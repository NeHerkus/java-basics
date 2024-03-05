package lt.itacademy.java.basics;

import java.util.Scanner;

public class Operators {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first side: ");
        int firstSide = Integer.parseInt(scan.nextLine());

        System.out.println("Enter second side: ");
        int secondSide = Integer.parseInt(scan.nextLine());

        System.out.println("Enter third side: ");
        int thirdSide = Integer.parseInt(scan.nextLine());

        System.out.println(triangle(firstSide, secondSide, thirdSide));

//        Program has four parameters: distance to the destination,
//        how much fuel does the car have in the tank, car fuel usage per 100km and fuel price per liter.




    }

    //task 5
    static String triangle(int firstSide, int secondSide, int thirdSide) {
        if (firstSide + secondSide > thirdSide &&  secondSide + thirdSide >firstSide  && firstSide + thirdSide > secondSide) {
            if (secondSide == thirdSide && firstSide == thirdSide) {
                return "Triangle is Equilateral. Sides: " + firstSide + " " + secondSide + " " + thirdSide;
            } else if (secondSide == thirdSide || firstSide == thirdSide || firstSide == secondSide) {
                return "Triangle is Isosceles. Sides: " + firstSide + " " + secondSide + " " + thirdSide;
            } else {
                return "Triangle is Scalene. Sides: " + firstSide + " " + secondSide + " " + thirdSide;
            }
        }
        return "Triangle is invalid. Sides: " + firstSide + " " + secondSide + " " + thirdSide;
    }
    //task6


}
