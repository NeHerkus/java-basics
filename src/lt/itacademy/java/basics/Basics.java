package lt.itacademy.java.basics;
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your surname: ");
        String surname = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Hello my name is " + name + " " + surname + " and I am " + age + " years old. I am attending IT & Data Academy 2024!");
    }
}