import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 08 Окт., 2019
 */
public class Kata2Test {

    @Test
    public void rowSumOddNumbers_ZeroInput() {
        int expected = 0;
        int actual = Kata2.rowSumOddNumbers(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void rowSumOddNumbers_BasicTest() {
        int expected = 8;
        int actual = Kata2.rowSumOddNumbers(2);
        Assert.assertEquals(expected, actual);

        expected = 27;
        actual = Kata2.rowSumOddNumbers(3);
        Assert.assertEquals(expected, actual);

        expected = 125;
        actual = Kata2.rowSumOddNumbers(5);
        Assert.assertEquals(expected, actual);
    }

}