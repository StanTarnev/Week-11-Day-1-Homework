import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void canDrinkOneTenth(){
        waterBottle.drinkOneTenth();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void canEmptyBottle(){
        waterBottle.emptyBottle();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void canRefillBottle() {
        waterBottle.emptyBottle();
        waterBottle.refillBottle();
        assertEquals(100, waterBottle.getVolume());
    }
}
