import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }


    @Test
    public void totalVolume() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void isBottleEmpty() {
        assertEquals(0, waterBottle.emptyBottle());
    }

    @Test
    public void isBottleFull() {
        assertEquals(100, waterBottle.fullBottle());
    }

    @Test
    public void subtractBottleUntilEmpty() {
        assertEquals(90, waterBottle.subtractBottle());
    }
}









