package lt.itacademy.java.basics;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
public class Arithmetic {
    public static void main(String[] args){
        Scanner scanner = new Scanner(in);
        out.print("Enter cube's edge: ");
        int edge = scanner.nextInt();
        out.println("Cube's volume: " + (int) Math.pow(edge,3) + "cm3");
        out.println("Cube's perimeter: " + edge * 12 + "cm");

        Scanner scan = new Scanner(in);
        out.print("Enter feet and inches: ");
        String imp = scan.nextLine();
        String[] impArr = imp.split(" ");

        double feet = Double.parseDouble(impArr[0]);
        double inch = Double.parseDouble(impArr[1]);
        out.println(feet + " feet and " + inch + " inches = " + (12 * feet + inch)*2.54 + "cm");
    }
}