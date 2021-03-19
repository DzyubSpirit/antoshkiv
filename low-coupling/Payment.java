package GraspPatterns;

import java.time.LocalDateTime;
import java.util.Random;

public class Payment {

    private double amount;
    private LocalDateTime dateTime;
    private double ID;

    Payment(double amount){
        this.amount = amount;
        this.ID = Math.random() * (100.0 - 0.0 + 1.0) + 0.0;
        this.dateTime =   LocalDateTime.now();
    }

    public double getAmount() {
        return amount;
    }
}
