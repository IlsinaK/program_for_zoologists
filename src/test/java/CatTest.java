import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;


public class CatTest {

    private Feline feline;
    private Cat cat;

    @Before
    public void setUp() {
        feline = Mockito.mock(Feline.class);
        cat = new Cat(feline);
    }

    @Test
    public void getSoundTest() {
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();

    Assert.assertEquals("Ожидалось, что звук кота будет '" + expectedSound + "', но получен звук: '" + actualSound + "'", expectedSound, actualSound);
    }

    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> food = cat.getFood();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }
}
