package ee.tublipoiss.jbrains;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTest {


    @Test
    public void should_have_proper_toString_implementation() throws Exception {
        // given

        // when

        // then
        assertEquals("1/2", new Fraction(1, 2).toString());
    }
}
