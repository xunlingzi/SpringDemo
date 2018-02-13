package bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class MagicianTest {

    @Test
    public void interceptThoughts() {
        new Volunteer().thinkOfSomething("Queen of Hearts");
        assertEquals("Queen of Hearts", new Magician().getThoughts());
    }
}