package Parametrizado;

import org.example.Parametrizado.PalindromeChecker;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//QUESTÃO 11

public class PalindromeCheckerTest {

    static PalindromeChecker palindromeChecker;

    @BeforeAll
    public static void setUp() {
        palindromeChecker = new PalindromeChecker();
    }

    @AfterAll
    public static void tearDown() {
        palindromeChecker = null;
    }
    @ParameterizedTest
    @CsvSource({
            "ala",
            "ovo",
            "natan"
    })
    public void palindromeTestTrue(String word) {
        assertTrue(palindromeChecker.isPalindrome(word));
    }
    @ParameterizedTest
    @CsvSource({
            "banan",
            "moscou",
            "sete"
    })
    public void palindromeTestFalse(String word) {
        assertFalse(palindromeChecker.isPalindrome(word));
    }

}
