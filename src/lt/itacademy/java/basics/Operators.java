package lt.itacademy.java.basics;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
//        Task 5
        Scanner sc = new Scanner(System.in);
        int firstSide = sc.nextInt();
        int secondSide = sc.nextInt();
        int thirdSide = sc.nextInt();
        System.out.println(calculateTriangle(firstSide, secondSide, thirdSide) + firstSide + " " + secondSide + " "  + thirdSide);
    }

    public static String calculateTriangle(int firstSide, int secondSide, int thirdSide){
        int sumOfFirstSecond = firstSide + secondSide;
        int sumOfSecondThird = thirdSide + secondSide;
        int sumOfFirstThird = firstSide + thirdSide;

        if(sumOfFirstSecond < thirdSide || sumOfSecondThird < firstSide || sumOfFirstThird < secondSide){
            return "Triangle is invalid. Sides: ";}

        if (firstSide == secondSide && secondSide == thirdSide){
            return "Triangle is Equilateral. Sides: ";}

        else if(firstSide == secondSide || secondSide == thirdSide){
            return "Triangle is Isosceles. Sides: ";
        }
        else {return "Triangle is Scalene. Sides: ";}
    }
}

