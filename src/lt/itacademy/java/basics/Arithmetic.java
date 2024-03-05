package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cube edge length");
        int input = scanner.nextInt();
        System.out.println(" -Cube's volume: " + getVolume(input)
                + "cm3.\n" + " -Cube's perimeter: " + getPerimeter(input) + "cm.");
    }
    
    public static int getPerimeter(int l){
        return l*12;
    }
    public static int getVolume(int l){
        return l*l*l;
    }
}
