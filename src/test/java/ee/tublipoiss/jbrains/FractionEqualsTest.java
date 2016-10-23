package ee.tublipoiss.jbrains;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FractionEqualsTest {

    @Test
    public void differentObject() throws Exception {
        // given

        // when

        // then
        assertEquals(false, new Fraction(3,5).equals("anyString"));
    }

    @Test
    public void sameNumeratorAndDenominator() throws Exception {
        // given

        // when

        // then
        assertEquals(new Fraction(3, 5), new Fraction(3, 5));
    }

    @Test
    public void sameNumeratorAndDifferentDenominator() throws Exception {
        // given

        // when

        // then
        assertNotEquals(new Fraction(3, 5), new Fraction(3, 6));
    }

    @Test
    public void differentNumeratorAndSameDenominator() throws Exception {
        // given

        // when

        // then
        assertNotEquals(new Fraction(3, 5), new Fraction(4, 5));
    }

    @Test
    public void numeratorAndDenominatorMultipleOf() throws Exception {
        // given

        // when

        // then
        assertEquals(new Fraction(3, 5), new Fraction(6, 10));
    }
}
