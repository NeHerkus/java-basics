package lt.itacademy.java.basics;

public class Art {
    public static void main(String[] args) {
        drawTree(5);
    }

    public static void drawTree(int height) {
        // Draw the tree body
        for (int i = 0; i < height; i++) {
            // Print spaces
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            // Print hashes
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("#");
            }
            // Move to the next line after each row of hashes
            System.out.println();
        }

        // Draw the tree trunk
        for (int i = 0; i < height - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("#");
    }
}
