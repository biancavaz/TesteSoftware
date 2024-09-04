import org.example.StringUtils;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {

   private StringUtils su;

   @Before
   public void inicializa () {
       su = new StringUtils();
   }

   @Test
   public void isPalindromoTest (){
      assertTrue(su.isPalindromo("ala"));
   }

   @Test
   public void reverseTest () {
      assertEquals("leirbag", su.reverse("gabriel"));
      assertNull(su.reverse(null));
   }

   @Test
   public void toUpperCase () {
      assertEquals("LALA", su.toUpperCase("lala"));
      assertNull(su.toUpperCase(""));
   }

}
