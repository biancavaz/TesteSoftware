package Excecao;

import org.example.Excecao.DivisionCalculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

//QUESTÃO 5

public class DivisionCalculatorTest {

    static DivisionCalculator divisionCalculator;

    @BeforeAll
    public static void setup(){
        divisionCalculator = new DivisionCalculator();
    }

    @Test
    public void testDivision() throws Exception{
        Exception exception = assertThrows(Exception.class, ()->divisionCalculator.divide(5, 0));
        assertEquals("Divisão por zero não permitida", exception.getMessage());
    }

    @AfterAll
    public static void tearDown(){
        divisionCalculator=null;
    }
}
