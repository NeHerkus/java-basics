package lt.itacademy.java.basics;

import java.util.Scanner;

class MainBasics {
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
    }
}