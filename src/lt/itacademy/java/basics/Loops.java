package lt.itacademy.java.basics;

public class Loops {
    public static void main(String[] args) {
        daysToHoursAndMinutesForLoop(365);
        daysToHoursAndMinutesWhileLoop(365);
    }

    static void daysToHoursAndMinutesForLoop(int days) {
        int hours = 0;
        int minutes = 0;

        for(int i = days; i > 0; i--){
            hours += 24;
            minutes += 1440;
        }

        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");
    }

    static void daysToHoursAndMinutesWhileLoop(int days) {
        int hours = 0;
        int minutes = 0;

        while(days > 0){
            hours += 24;
            minutes += 1440;
            days--;
        }

        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");
    }
}
