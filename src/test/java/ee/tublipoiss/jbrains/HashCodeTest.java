package ee.tublipoiss.jbrains;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class HashCodeTest {
    
    @Test
    public void hashcodeCalculatedCorrectly() throws Exception {
        // given
            
        // when
            
        // then
        assertEquals(95, new Fraction(3,2).hashCode());
    }

    @Test
    public void sameHashCodeForSameFractions() throws Exception {
        // given

        // when

        // then
        assertEquals(new Fraction(3,2).hashCode(), new Fraction(3,2).hashCode());
    }

    @Test
    public void differentHashCodeForDifferentFractions() throws Exception {
        // given

        // when

        // then
        assertNotEquals(new Fraction(2,2).hashCode(), new Fraction(3,2).hashCode());
    }
}
