package opgave02.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LoanTest {
    public static void main(String[] args) {
        Loan loan = new Loan(LocalDate.of(2024,02,29));
        System.out.println("loan.calculateFine(LocalDate.of(2024,01,11),true) = " + loan.calculateFine(LocalDate.of(2024, 01, 11), true));
    }

    @Test
    void calculateFine() {
        Loan loan = new Loan(LocalDate.of(2024,02,29));
        int expected = 90;
        int actual = loan.calculateFine(LocalDate.of(2024,01,11),true);
        assertEquals(expected, actual);
    }
}