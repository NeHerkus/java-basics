package Telephone;

import java.math.BigDecimal;

public class PayPhone extends Telephone {
    private final BigDecimal call_Price = new BigDecimal("0.25");
    private BigDecimal balance;
    public PayPhone(BigDecimal money) {
        super("This is a pay phone");
        this.balance = money;
    }

    @Override
    public void call(String number) {
        if (this.balance.compareTo(call_Price) >= 0) {
            super.call(number);
            this.balance = this.balance.subtract(call_Price);
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Not enough money to make a call");
        }
    }
}
