package NamedClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DinglemouseTest {

    @Test
    public void noGaps() {
        assertEquals("GFEDCBA", Dinglemouse.antBridge("GFEDCBA", "-----------------------"));
    }

    @Test
    public void example() {
        assertEquals("EDCBAGF", Dinglemouse.antBridge("GFEDCBA", "------------...-----------"));
    }

}