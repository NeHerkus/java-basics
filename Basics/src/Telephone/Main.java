package Telephone;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        boolean called = false;
        Telephone phone = new Telephone("123456789");
        phone.call("987654321");
        System.out.println(phone.toString());

        int nrOfPhotos = 0;
        Mobile mobile = new Mobile("987654321", "Tele2", nrOfPhotos);
        mobile.call("123456789");
        String simNumber = mobile.getSimNumber();
        System.out.println(simNumber);
        mobile.takePhoto();
        System.out.println(mobile.getNumberOfPhotos());

        PayPhone payPhone = new PayPhone(BigDecimal.ZERO);
        payPhone.call("123456789");

        Telephone phone2 = new PayPhone(BigDecimal.ZERO);
        phone2.call("123456789");
    }
}
