import static org.junit.Assert.assertEquals;
import static testing.Main.price;

import org.junit.Test;

public class Boundary_testing {
    @Test
    public void boundary_testing1() {
        assertEquals(260, price(5, 2));
    }

    @Test
    public void boundary_testing2() {
        assertEquals(130, price(5, 1));
    }

    @Test
    public void boundary_testing3() {
        assertEquals(390, price(5, 3));
    }

    @Test
    public void boundary_testing4() {
        assertEquals(520, price(5, 4));
    }

    @Test
    public void boundary_testing5() {
        assertEquals(60, price(1, 2));
    }

    @Test
    public void boundary_testing6() {
        assertEquals(120, price(2, 2));
    }

    @Test
    public void boundary_testing7() {
        assertEquals(400, price(9, 2));
    }

    @Test
    public void boundary_testing8() {
        assertEquals(430, price(10, 2));
    }
}
