import java.util.Scanner;

public class Basics {

    public static void main(String[] args) {

//        firstTask();
        secondTask();



    }


    static void firstTask() {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split("\\s+");
        String firstName = inputArr[0], lastName = inputArr[1], age = inputArr[2];

        String output = String.format("Hello my name is %s %s and I am %s years old. I am attending IT & Data\n" +
                "Academy 2024!", firstName, lastName, age);
        System.out.println(output);
    }

    static void secondTask() {

        char h = 'H';
        short sh = 3110;
        char w = 'w';
        byte b = 0;
        char r = 'r';
        int i = 1;
        char d = 'd';
        float f = 2.0f;
        boolean bool = true;

        String s = "" + h + sh + " " + w + b + r + i + d + " " + f + " " + bool;
        System.out.println(s);
    }
}
