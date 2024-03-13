import static org.junit.Assert.assertEquals;
import static testing.Main.price;

import org.junit.Test;

public class Table_testing {
    @Test
    public void table_testingPrice1() {
        assertEquals(-1, price(-1, -1));
    }

    @Test
    public void table_testingPrice2() {
        assertEquals(-1, price(-1, 2));
    }

    @Test
    public void table_testingingPrice3() {
        assertEquals(-1, price(-1, 5));
    }

    @Test
    public void table_testingingPrice4() {
        assertEquals(-1, price(1, -1));
    }

    // TRON VN TRON VN TRON TRON VN
    @Test
    public void table_testingingPrice5() {
        assertEquals(60, price(1, 2));
    }

    @Test
    public void table_testingPrice6() {
        assertEquals(-1, price(1, 5));
    }

    @Test
    public void table_testingPrice7() {
        assertEquals(-1, price(4, -1));
    }

    @Test
    public void table_testingPrice8() {
        assertEquals(220, price(4, 2));
    }

    @Test
    public void table_testingPrice9() {
        assertEquals(-1, price(4, 5));
    }

    @Test
    public void table_testingPrice10() {
        assertEquals(-1, price(8, -1));
    }

    @Test
    public void table_testingPrice11() {
        assertEquals(555, price(8, 3));
    }

    @Test
    public void table_testingPrice12() {
        assertEquals(-1, price(8, 5));
    }

    @Test
    public void table_testingPrice13() {
        assertEquals(-1, price(11, -2));
    }

    @Test
    public void table_testingPrice14() {
        assertEquals(-1, price(11, 3));
    }

    @Test
    public void table_testingPrice15() {
        assertEquals(-1, price(11, 5));
    }
}
