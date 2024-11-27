import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class AnimalInvalidInputParamTest {

    private final String animalKind;
    private final String expectedMessage;

    public AnimalInvalidInputParamTest(String animalKind, String expectedMessage) {
        this.animalKind = animalKind;
        this.expectedMessage = expectedMessage;
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"Некорректный вид", "Неизвестный вид животного, используйте значение Травоядное или Хищник"},
                {"", "Неизвестный вид животного, используйте значение Травоядное или Хищник"},
                {null, "Неизвестный вид животного, используйте значение Травоядное или Хищник"}
        };
    }

    @Test

    public void getFoodInvalidInputTest() {
        Animal animal = new Animal();

        Exception exception = assertThrows(Exception.class, () -> animal.getFood(animalKind));

        assertEquals(expectedMessage, exception.getMessage());
    }
}

