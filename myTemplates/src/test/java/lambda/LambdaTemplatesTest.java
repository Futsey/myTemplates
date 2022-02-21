package lambda;

import org.junit.Test;

import static org.junit.Assert.*;

public class LambdaTemplatesTest {

    @Test
    public void whenPositive() {
        assertTrue(LambdaTemplates.predicateCheckPositive(1));
        assertFalse(LambdaTemplates.predicateCheckPositive(-1));
        assertFalse(LambdaTemplates.predicateCheckPositive(0));
    }

    @Test
    public void whenEven() {
        assertTrue(LambdaTemplates.predicateCheckEven(2));
        assertFalse(LambdaTemplates.predicateCheckEven(1));
    }

    @Test
    public void whenPositiveAndEven() {
        assertTrue(LambdaTemplates.predicateCheckEvenAndPositive(2));
        assertFalse(LambdaTemplates.predicateCheckEvenAndPositive(-2));
        assertFalse(LambdaTemplates.predicateCheckEvenAndPositive(1));
    }

    @Test
    public void test() {
        assertEquals(4, LambdaTemplates.functionPow(2), 0.01);
        assertEquals(9, LambdaTemplates.functionPow(3), 0.01);
    }
}