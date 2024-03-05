import java.util.Scanner;

public class Basics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split("\\s+");
        String firstName = inputArr[0], lastName = inputArr[1], age = inputArr[2];

        String output = String.format("Hello my name is %s %s and I am %s years old. I am attending IT & Data\n" +
                "Academy 2024!", firstName, lastName, age);
        System.out.println(output);
    }
}
