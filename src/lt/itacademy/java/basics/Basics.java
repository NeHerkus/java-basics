package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics {

    static public void main(String[] args){
        //  task1();
        //  task2();

    }
    public static void task2(){
        int intType = 5;
        boolean boolType = true;
        byte byteType = 0;
        char charType = '*';
        float floatType = 0.3f;
        short shortType = 11;

        String output = String.valueOf(intType) + String.valueOf(byteType)
                + String.valueOf(boolType) + String.valueOf(charType)
                + String.valueOf(floatType) + String.valueOf(shortType);
        System.out.println(output);
    }
    public static void task1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write your full name and age splitting with spaces: ");
        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        try {
            System.out.println("Hello my name is " + arr[0] + " " + arr[1] +" and I am " + arr[2] + " years old. I am attending IT & Data Academy 2024!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
