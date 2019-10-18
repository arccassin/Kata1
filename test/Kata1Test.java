import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 07 Окт., 2019
 */
public class Kata1Test {

    @Test
    public void countPositivesSumNegatives_InputNull() {
        int inArr[] = null;
        int expected[] = new int[0];

        int actual[] = Kata1.countPositivesSumNegatives(inArr);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void countPositivesSumNegatives_InputWithZeroes() {
        int inArr[] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int expected[] = new int[] {0, 0};

        int actual[] = Kata1.countPositivesSumNegatives(inArr);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void countPositivesSumNegatives_BasicTest() {
        int inArr[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        int expected[] = new int[] {10, -65};

        int actual[]  = Kata1.countPositivesSumNegatives(inArr);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void countPositivesSumNegatives_InputEmpty() {
        int inArr[] = new int[0];
        int expected[] = new int[0];

        int actual[] = Kata1.countPositivesSumNegatives(inArr);

        Assert.assertArrayEquals(expected, actual);
    }
}