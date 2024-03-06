package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        secondTask();
        Scanner myObj = new Scanner(System.in);
        String userName = myObj.nextLine();
        String lastName = myObj.nextLine();
        int age = myObj.nextInt();
        firstTask(userName, lastName, age);
    }

    private static void firstTask(String userName, String lastName, int age) {
        String example = """
                Hello my name is %s %s and I am %d years old. I am attending IT & Data Academy 2024
                """.formatted(userName, lastName, age);
        System.out.println(example);
    }

    private static void secondTask() {
        int a = 3;
        char b = 'H';
        float c = 2.0F;
        boolean d = true;
        char[] e = "w0r1d".toCharArray();
        byte f = 110;

        String result = b + "" + a + f + " " + new String(e) + " " + c + " " + d;
        System.out.println(result);
    }
}
