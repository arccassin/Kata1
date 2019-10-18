import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 09 Окт., 2019
 */
public class Kata3Test {

    @Test
    public void findMissingLetter_BasicTest1() {
        char inArr[] = new char[] {'a','b','c','d','f'};
        char expected = 'e';

        char actual = Kata3.findMissingLetter(inArr);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findMissingLetter_BasicTest2() {
        char inArr[] = new char[] {'O','Q','R','S'};
        char expected = 'P';

        char actual = Kata3.findMissingLetter(inArr);

        Assert.assertEquals(expected, actual);
    }

}