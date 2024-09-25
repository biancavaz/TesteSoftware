import org.example.ValidadorIdade;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorIdadeTest {

    @ParameterizedTest
    @CsvSource ({
            "15, false",
            "18, true",
            "3, false"
    })

    public void testisMaiorIdade (int idade, boolean expected){
        ValidadorIdade validar = new ValidadorIdade();
        assertEquals(expected, validar.isMaiorIdade(idade));
    }
}
