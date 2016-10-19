package ee.tublipoiss.jbrains;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTest {

    @Test
    public void should_add_7_3_and_4_5_to_47_15() {
        final Fraction first = new Fraction(7, 3);
        final Fraction second = new Fraction(4, 5);

        final Fraction sum = first.add(second);

        assertEquals(new Fraction(47, 15), sum);
    }

    @Test
    public void should_add_0_and_0_to_0() {

        final Fraction first = new Fraction(0);
        final Fraction second = new Fraction(0);

        final Fraction sum = first.add(second);

        assertEquals(new Fraction(0), sum);
    }

    @Test
    public void should_add_1_2_and_0_to_1_2() {

        final Fraction first = new Fraction(1, 2);
        final Fraction second = new Fraction(0);

        final Fraction sum = first.add(second);

        assertEquals(new Fraction(1, 2), sum);
    }

    @Test
    public void should_add_1_2_and_1_2_to_1() {

        final Fraction first = new Fraction(1, 2);
        final Fraction second = new Fraction(1, 2);

        final Fraction sum = first.add(second);

        assertEquals(new Fraction(1, 1), sum);
    }

    @Test
    public void should_add_3_1_and_2_1_to_5_1() {

        final Fraction first = new Fraction(3, 1);
        final Fraction second = new Fraction(2, 1);

        final Fraction sum = first.add(second);

        assertEquals(new Fraction(5, 1), sum);
    }

    @Test
    public void should_add_1_2_and_6_4_to_2() {

        final Fraction first = new Fraction(1, 2);
        final Fraction second = new Fraction(6, 4);

        final Fraction sum = first.add(second);

        assertEquals(new Fraction(2), sum);
    }
}
