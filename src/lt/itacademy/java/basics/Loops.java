package lt.itacademy.java.basics;

public class Loops {
    public static void main(String[] args) {
        int days = 365;
        calculateHoursAndMins(days);
    }
    public static void calculateHoursAndMins(int days) {
        int hours = 0;
        int minutes = 0;

        for (int day = 1; day <= days; day++) {
            hours += 24;
            minutes += 24 * 60;
        }

        System.out.println("There are " + hours + " hours and " + minutes + " minutes per year");
    }
}
