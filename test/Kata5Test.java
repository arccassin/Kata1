import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 12 Окт., 2019
 */
public class Kata5Test {

    @Test
    public void nextBiggerNumber_BasicTest() {
        assertEquals(21, Kata5.nextBiggerNumber(12));
        assertEquals(531, Kata5.nextBiggerNumber(513));
        assertEquals(2071, Kata5.nextBiggerNumber(2017));
        assertEquals(441, Kata5.nextBiggerNumber(414));
        assertEquals(414, Kata5.nextBiggerNumber(144));
        assertEquals(1234567908, Kata5.nextBiggerNumber(1234567890));
    }

    @Test
    public  void nextBiggerNumber_NotValid(){
        assertEquals(-1, Kata5.nextBiggerNumber(9));
        assertEquals(-1, Kata5.nextBiggerNumber(111));
        assertEquals(-1, Kata5.nextBiggerNumber(531));
    }
}