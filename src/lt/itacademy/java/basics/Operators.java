package lt.itacademy.java.basics;
import javax.swing.plaf.PanelUI;
import java.util.Scanner;
import static java.lang.System.*;

public class Operators {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(in);
        out.print("Enter 1 for triangle, 2 for carTravel : ");
        int i = scanner.nextInt();
        if (i == 1) {
            Triangle();
        } else if (i == 2) {
            CarTravel();
        }
    }

    public static void Triangle() {
        Scanner scanner = new Scanner(in);
        out.print("Enter triangle edges: ");
        String edges = scanner.nextLine();
        String[] edgesArr = edges.split(" ");
        int edge1 = Integer.parseInt(edgesArr[0]);
        int edge2 = Integer.parseInt(edgesArr[1]);
        int edge3 = Integer.parseInt(edgesArr[2]);

        if (edge1 == edge2 && edge2 == edge3) {
            out.println("Triangle is Equilateral. Sides: " + edge1 + " " + edge2 + " " + edge3);
        } else if ((edge1 == edge2 || edge2 == edge3 || edge1 == edge3) &&
                ((edge1 + edge2) > edge3 && (edge1 + edge3) > edge2 && (edge2 + edge3 > edge1))) {
            out.println("Triangle is Isosceles. Sides: " + edge1 + " " + edge2 + " " + edge3);
        } else if ((edge1 + edge2) > edge3 && (edge1 + edge3) > edge2 && (edge2 + edge3 > edge1)) {
            out.println("Triangle is Scalene. Sides: " + edge1 + " " + edge2 + " " + edge3);
        } else {
            out.println("Triangle is invalid. Sides: " + edge1 + " " + edge2 + " " + edge3);
        }
    }

    public static void CarTravel() {
        int range;
        double fuel;
        double usage;
        double price;

        Scanner scanner = new Scanner(in);
        out.print("Enter your range: ");
        range = scanner.nextInt();
        out.print("Fuel left: ");
        fuel = scanner.nextDouble();
        out.print("Fuel usage per 100km: ");
        usage = scanner.nextDouble();
        out.print("Fuel price: ");
        price = scanner.nextDouble();


    }
}
