package Parametrizado;

import org.example.Parametrizado.TaxCalculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// QUESTÃO 12

import static org.junit.Assert.*;

public class TaxCalculatorTest {
    static TaxCalculator taxCalculator;

    @BeforeAll
    public static void setUp() {
        taxCalculator = new TaxCalculator();
    }

    @AfterAll
    public static void tearDown() {
        taxCalculator = null;
    }
    @ParameterizedTest
    @CsvSource({
            "1500",
            "2000",
            "9000"
    })
    public void calculateTaxTest10000(double income) {
        assertEquals(income*0.1, taxCalculator.calculateTax(income), 0.000001);
    }
    @ParameterizedTest
    @CsvSource({
            "11500",
            "12000",
            "19000"
    })
    public void calculateTaxTest20000(double income) {
        assertEquals(income*0.15, taxCalculator.calculateTax(income), 0.000001);
    }
    @ParameterizedTest
    @CsvSource({
            "21500",
            "22000",
            "290000"
    })
    public void calculateTaxTest(double income) {
        assertEquals(income*0.2, taxCalculator.calculateTax(income), 0.000001);
    }



}
