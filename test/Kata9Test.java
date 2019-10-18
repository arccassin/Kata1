import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by User on 17 Окт., 2019
 */
public class Kata9Test {

    @Test
    public void test1_1() {
        assertEquals(5, Kata9.pointsNumber(1));
    }

    @Test
    public void test1_2() {
        assertEquals(13, Kata9.pointsNumber(2));
    }

    @Test
    public void test1_3() {
        assertEquals(29, Kata9.pointsNumber(3));
    }

    @Test
    public void test1_4() {
        assertEquals(81, Kata9.pointsNumber(5));
    }

    @Test
    public void test1_5() {
        assertEquals(3141549, Kata9.pointsNumber(1000));
    }

}