package lt.itacademy.java.basics;

import java.util.Scanner;

public class Art {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char treeChar = '#';

        System.out.println("Input value: ");
        int depthOfTree = scanner.nextInt();
        scanner.close();

        for(int i = 1; i <= depthOfTree; i++){

            for(int k = depthOfTree - (i - 1); k > 0; k--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i + (i - 1); j++){
                System.out.print(treeChar);
            }
            System.out.println(" ");
        }
    }
}
