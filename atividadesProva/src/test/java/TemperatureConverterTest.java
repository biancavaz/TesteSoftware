import org.example.TemperatureConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {

    static TemperatureConverter temp;

    @BeforeAll
    public static void setup (){
        temp = new TemperatureConverter();
    }

    @Test
    public void celsiusToKelvinSucsses () throws Exception {
        Assertions.assertEquals(0, temp.celsiusToKelvin(-273.15));
    }

    @Test
    public void celsiusToKelvinExeption () {
        Exception exception = Assertions.assertThrows( Exception.class, () -> {
            temp.celsiusToKelvin(-274);
        });

        Assertions.assertEquals("Temperatura abaixo do zero absoluto", exception.getMessage());
    }
}
