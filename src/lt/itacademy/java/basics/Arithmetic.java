package lt.itacademy.java.basics;

import java.util.Scanner;

class Arithmetic {
    public static void main(String[] args) {

        int volume;
        int perimeter;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int side = sc.nextInt();

        volume = side * side * side;
        perimeter = side * 12;

        System.out.println("Cube’s volume: " + volume + "cm3");
        System.out.println("Cube’s perimeter: " + perimeter + "cm");

        // TASK 4
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter feet: ");
        double feetai = scanner.nextDouble();

        System.out.print("Enter inches: ");
        double inchai = scanner.nextDouble();

        double answer = Converter(feetai, inchai);
        System.out.println(feetai + " feet and " + inchai + " inches = " + answer + " cm");
    }

    static double Converter(double feetai, double inchai) {

        double feet_to_cent = feetai * 30.48;
        double inches_to_cent = inchai * 2.54;

        return feet_to_cent + inches_to_cent;
    }
}