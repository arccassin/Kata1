import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by User on 15 Окт., 2019
 */
public class Kata7Test {

    @Test
    public void fireAndFury_ex1() {
        assertEquals("I am furious. You and you are fired!", Kata7.fireAndFury("FURYYYFIREYYFIRE"));
    }

    @Test
    public void fireAndFury_ex2() {
        assertEquals("You are fired! I am really furious. You are fired!", Kata7.fireAndFury("FIREYYFURYYFURYYFURRYFIRE"));
    }

    @Test
    public void fireAndFury_ex3() {
        assertEquals("Fake tweet.", Kata7.fireAndFury("FYRYFIRUFIRUFURE"));
    }

    @Test
    public void fireAndFury_ex4() {
        assertEquals("Fake tweet.", Kata7.fireAndFury("FuRYYYFIREYYFIRE"));
    }
}