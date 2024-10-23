package Performance;

import org.example.Performance.PrimeNumberGenerator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

//QUESTÃO 8


public class PrimeNumberGeneratorTest {

    static PrimeNumberGenerator primeNumberGenerator;

    @BeforeAll
    public static void setup(){
        primeNumberGenerator = new PrimeNumberGenerator();
    }
    @AfterAll
    public static void teardown(){
        primeNumberGenerator = null;
    }
    @Test
    public void primeNumberGeneratorTest(){
        long antes = System.nanoTime();
        List<Integer> lista = primeNumberGenerator.generatePrimes(10);
        long depois = System.nanoTime();
        System.out.println("tempo tomado para calcular primos "+ (depois-antes) +" nano segundos");

    }//perguntar pro professor se é pra testar o tempo ou oque

}
