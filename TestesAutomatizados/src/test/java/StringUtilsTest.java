import org.example.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {

    StringUtils stringUtils;

    @BeforeEach
    public void setUp () {
        stringUtils = new StringUtils();
    }

    @Test
    public void testReverseWithValidString(){

        String input = "hello";

        String result = stringUtils.reverse(input);
        assertEquals("olleh", result);
    }

    @Test
    public void testReverseWithEmptyString(){
        String input = "";

        String result = stringUtils.reverse(input);
        assertEquals("A string deveria ser vazia", result, "");
    }

    @Test
    public void testIsPalindromeWithPalindromeString() {
        String input = "ala";

        boolean result = stringUtils.isPalindrome(input);
        assertTrue("A string 'ala' deveria ser um palindromo", result );
    }

    @Test
    public void testIsPalindromeWithNonPalindromeString() {
        String input = "hello";

        boolean result = stringUtils.isPalindrome(input);
        assertFalse("A string não deveria ser uma palindromo", result);
    }

    @Test
    public void testIsPalindromeWithSpacesAndCapitalLetters() {
        String input = "A man a plan a canal panama ";

        boolean result = stringUtils.isPalindrome(input);
        assertTrue("A string deveria ser uma palindromo, " +
                "ignorando as letras maiúsculas e os espaços em branco", result );
    }

}
