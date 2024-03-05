package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics {

    static Scanner sc = new Scanner(System.in);

    public static void read() {
        System.out.println("Write your name and surname anf age");
        String st = sc.nextLine();
        String[] strings = st.split(" ");
        System.out.println("Hello name is " + strings[0] + " " + strings[1] + " and I am " + strings[2] + " years old. I am attending IT & Data Academy 2024!");
    }

    public static void main(String[] args) {

        read();


    }
}
