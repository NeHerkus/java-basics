package lt.itacademy.java.basics;

public class Art {
    public static void main(String[] args) {
        drawTree(5);
    }

    public static void drawTree(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("#");
            }
            System.out.println();
        }

        for (int i = 0; i < height - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("#");
    }
}
