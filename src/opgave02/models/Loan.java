package opgave02.models;

import java.net.DatagramSocket;
import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Loan {
    private LocalDate returnDate;

    public Loan(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int calculateFine(LocalDate actualDate, boolean adult) {
        long daysBetween = DAYS.between(actualDate,returnDate);
        int fine = 0;
        if (daysBetween >= 1 && daysBetween <= 7 && adult == false){
            fine += 10;
        }
        if (daysBetween >= 1 && daysBetween <= 7 && adult == true){
            fine += 20;
        }
        if (daysBetween >= 8 && daysBetween <= 14 && adult == false){
            fine += 30;
        }
        if (daysBetween >= 8 && daysBetween <= 14 && adult == true){
            fine += 60;
        }
        if (daysBetween > 15 && adult == false){
            fine += 45;
        }
        if (daysBetween > 15 && adult == true){
            fine += 90;
        }
        return fine;
    }

}
