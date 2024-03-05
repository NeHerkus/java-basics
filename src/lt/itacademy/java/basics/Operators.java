package lt.itacademy.java.basics;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        int sideA;
        int sideB;
        int sideC;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Write three numbers, that will represent the sides of a triangle:");
        sideA = scanner.nextInt();
        sideB = scanner.nextInt();
        sideC = scanner.nextInt();
        scanner.close();

        System.out.printf("Triangle is %s. Sides: %d %d %d", getTypeOfTriangle(sideA, sideB, sideC), sideA, sideB, sideC);

    }

    public static String getTypeOfTriangle(int sideA, int sideB, int sideC){
        String type;
        if(sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
             return "invalid";
        }

        if(sideA == sideB && sideB == sideC){
            type = "Equilateral";
        } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            type = "Isosceles";
        }else {
            type = "Scalene";
        }
        return type;
    }
}
