package lt.itacademy.java.basics;

import java.util.Scanner;

public class Loops {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("provide days");

    int days = reader.nextInt();

    int hours = 0;
    int minutes = 0;
    for (int i = 0; i < days; i++) {
      hours+=24;
      minutes+=24*60;
    }

    System.out.println("There are " + hours + " hours or " + minutes + " in one year.");
  }

  }
