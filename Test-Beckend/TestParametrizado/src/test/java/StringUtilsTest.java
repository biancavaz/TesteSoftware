import org.example.StringUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
public class StringUtilsTest {

    @ParameterizedTest
    @ValueSource (strings = {"madam", "racecar", "a man a plan a canal panama", "radar", "hello"})
    public void testisPalindrome(String candidate){

        StringUtils utils = new StringUtils();
        boolean result = utils.isPalindrome(candidate);
        if (candidate.equals("hello")) {
            assertFalse(result); //hello não é um palindromo
        } else {
            assertTrue(result); // os outros são palindromos
        }

    }

}
