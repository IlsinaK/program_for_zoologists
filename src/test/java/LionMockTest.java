import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionMockTest {

 private Feline feline;
 private Lion lion;

 @Before
 public void setUp() throws Exception {
     feline = Mockito.mock(Feline.class);
     lion = new Lion(feline, "Самец");
 }

    @Test
    public void getKittensTest() throws Exception {
       Mockito.when(feline.getKittens()).thenReturn(3);

        assertEquals(3, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        List<String> food = lion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }
}
