package ee.tublipoiss.jbrains;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFirstTest {

    @Test
    public void should_return_the_ultimate_answer() {
        AnswerMachine answerMachine = new AnswerMachine();
        assertEquals(42, answerMachine.answer());
    }
}
