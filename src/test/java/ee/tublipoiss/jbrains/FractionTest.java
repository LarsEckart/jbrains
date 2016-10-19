package ee.tublipoiss.jbrains;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTest {

    @Test
    public void should_add_7_3_and_4_5_to_47_15() {
        final Fraction first = new Fraction(7, 3);
        final Fraction second = new Fraction(4, 5);

        final Fraction sum = first.add(second);

        assertEquals(new Fraction(47,15), sum);
    }

    @Test
    public void should_add_0_and_0_to_0(){

        final Fraction first = new Fraction(0);
        final Fraction second = new Fraction(0);

        final Fraction sum = first.add(second);

        assertEquals(new Fraction(0), sum);
    }
}
