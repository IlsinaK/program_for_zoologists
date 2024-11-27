import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class LionInvalidSexParamTest {

    private final String sex;

    public LionInvalidSexParamTest(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"НекорректныйПол"},
                {""},
                {null}
        };
    }

    @Test
    public void lionConstructorInvalidSexTest() {
        Feline feline = Mockito.mock(Feline.class);

        Exception thrown = assertThrows(Exception.class, () -> new Lion(feline, sex));
        assertEquals("Используйте допустимые значения пола животного - самей или самка", thrown.getMessage());
    }
}

