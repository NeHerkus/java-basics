package lt.itacademy.java.basics;

import java.util.Scanner;

public class Calculator {

  private static Scanner reader = new Scanner(System.in);

  public static int calculateRectanglePerimeter(int side1, int side2) {
    return side1 * 2 + side2 * 2;
  }

  public static int calculateRectangleArea(int side1, int side2) {
    return side1 * side2;
  }

  public static boolean calculateRectangle() {
    System.out.println("Enter a side for Rectangle");

    int side1 = Calculator.reader.nextInt();

    System.out.println("Enter another side for Rectangle");
    int side2 = Calculator.reader.nextInt();

    if (side2 <= 0 || side1 <= 0) {
      System.out.println("Rectangle edge length can’t be 0 or less.");
      return false;
    }

    System.out.println("Rectangle perimeter is "
            + calculateRectanglePerimeter(side1, side2)
            + " and area is "
            + calculateRectangleArea(side1, side2)
    );

    return true;
  }

  public static boolean calculateTriangle() {
    System.out.println("Enter the height: ");

    int height = reader.nextInt();

    System.out.println("Enter base: ");

    int base = reader.nextInt();


  }
  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);

    loop:
    while (true) {
      System.out.println("Enter a geometric shapes: (Triangle, Rectangle, Square) or press q to exit");
      String geometricShape = reader.nextLine();


      if (geometricShape.equals("q")) {
        break;
      }

      System.out.println(geometricShape);

      switch (geometricShape) {
        case "Triangle":

          break;
        case "Rectangle":
          calculateRectangle();
          break;
        case "Square":
          break;
        default:
          System.out.println("provide valid geometric shape");
          continue loop;
      }

    }



  }

}
