package Telephone;

public class Telephone {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    private String number;
    public Telephone (String nr) {
        this.number = nr;
    }
    public void setRingtone(String ringtone) {
    }
    public String getNumber() {
        return number;
    }
    public void call(String number) {
        System.out.println(STR."The caller of \{this.number} is calling \{number}");
    }
}
