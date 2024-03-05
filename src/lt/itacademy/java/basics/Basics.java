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
//        read();

        boolean bool = true;
        byte one = 1;
        char h = 'H';
        char w = 'w';
        char r = 'r';
        char d = 'd';
        float fl = 2.0f;
        int i = 3110;
        short zero = 0;
        System.out.println("" + h + i + " " + w + zero + r + one + d + " " + fl + " " + bool);


    }
}
