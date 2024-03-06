package opgave01.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInsuranceTest {
    public static void main(String[] args) {
        CarInsurance c1 = new CarInsurance(1000);
        System.out.println("c1.calculatePremium(28,false,0) = " + c1.calculatePremium(28, false, 9));
    }


    @Test
    void calculatePremium() {
        CarInsurance test = new CarInsurance(1000);
        double expected = 1200;
        double actual = test.calculatePremium(20,true,1);
        assertEquals(expected,actual);
    }
}