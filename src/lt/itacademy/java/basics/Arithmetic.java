package lt.itacademy.java.basics;
import java.util.Scanner;
import static java.lang.System.*;
public class Arithmetic {
    public static void main(String[] args){
        Scanner scanner = new Scanner(in);
        out.print("Enter cube's edge: ");
        int edge = scanner.nextInt();
        out.println("Cube's volume: " + (int) Math.pow(edge,3) + "cm3");
        out.println("Cube's perimeter: " + edge * 12 + "cm");
    }
}
