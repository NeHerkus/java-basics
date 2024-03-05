package lt.itacademy.java.basics;

public class Loops {

    public static void yearToHoursMinutes(int daysPerYear) {
        int hours = 0;
        long minutes = 0;
        for (int i = 0; i < daysPerYear; i++) {
            hours += 24;
            minutes += 1440;
        }
        System.out.printf("There are %d hours or %d minutes in one year.", hours, minutes);
    }

    public static void main(String[] args) {
        yearToHoursMinutes(365);
    }
}
