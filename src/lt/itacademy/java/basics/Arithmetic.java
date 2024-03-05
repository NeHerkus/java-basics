package lt.itacademy.java.basics;

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
    }
}
