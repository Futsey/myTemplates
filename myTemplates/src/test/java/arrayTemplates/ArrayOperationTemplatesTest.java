package arrayTemplates;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class ArrayOperationTemplatesTest {

    @Test
    public void whenBothEmpty() {
        int[] expect = new int[0];
        int[] result = ArrayOperationTemplates.merge(
                new int[0],
                new int[0]
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenReorder() {
        int[] expect = {1, 2, 3, 4};
        int[] result = ArrayOperationTemplates.merge(
                new int[] {1, 3},
                new int[] {2, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenAscOrder() {
        int[] expect = {1, 2, 3, 4};
        int[] result = ArrayOperationTemplates.merge(
                new int[] {1, 2},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftLess() {
        int[] expect = {1, 2, 3, 3, 4};
        int[] result = ArrayOperationTemplates.merge(
                new int[] {1, 2, 3},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftGreat() {
        int[] expect = {1, 2, 3, 4, 4};
        int[] result = ArrayOperationTemplates.merge(
                new int[] {1, 2},
                new int[] {3, 4, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftEmpty() {
        int[] expect = {1, 2, 3, 4};
        int[] result = ArrayOperationTemplates.merge(
                new int[] {},
                new int[] {1, 2, 3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void checkArrayTrue() {
        int[][] in = new int[][]{{4, 5, 6}, {2, 3, 0}, {1, 7, 8}};
        boolean result = ArrayOperationTemplates.checkArray(in);
        assertThat(result, is(true));
    }

    @Test
    public void checkArrayFalse() {
        int[][] in = new int[][]{{4, 5, 6}, {2, 3}, {1}};
        boolean result = ArrayOperationTemplates.checkArray(in);
        assertThat(result, is(false));
    }

    @Test
    public void test() {
        assertArrayEquals(new int[] {1, 2, 3}, ArrayOperationTemplates.calculate(1, 2, 3));
        assertArrayEquals(new int[] {1, 2, 3, 6}, ArrayOperationTemplates.calculate(1, 2, 4));
        assertArrayEquals(new int[] {1, 2, 3, 6, 12}, ArrayOperationTemplates.calculate(1, 2, 5));
    }

    @Test
    public void whenNotContain() {
        assertEquals(-1, ArrayOperationTemplates.indexOf(
                new char[] {'a', 'b', 'c'},
                'd',
                1
        ));
    }

    @Test
    public void whenOrdinary() {
        assertEquals(3, ArrayOperationTemplates.indexOf(
                new char[] {'a', 'b', 'c', 'd'},
                'd',
                1
        ));
    }

    @Test
    public void whenByNumber() {
        assertEquals(6, ArrayOperationTemplates.indexOf(
                new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'd'},
                'd',
                2
        ));
    }

    @Test
    public void maxLengthSeria() {
        assertEquals(1, ArrayOperationTemplates.maxLengthSeria(new int[] {1}));
        assertEquals(1, ArrayOperationTemplates.maxLengthSeria(new int[] {2, 1}));
        assertEquals(2, ArrayOperationTemplates.maxLengthSeria(new int[] {1, 2}));
        assertEquals(3, ArrayOperationTemplates.maxLengthSeria(new int[] {1, 2, 0, 1, 2, 3}));
        assertEquals(3, ArrayOperationTemplates.maxLengthSeria(new int[] {1, 2, 1, 1, 2, 3}));
        assertEquals(1, ArrayOperationTemplates.maxLengthSeria(new int[] {3, 2, 1}));
        assertEquals(9, ArrayOperationTemplates.maxLengthSeria(new int[] {6,7,8,9,10,11,1,11,12,13,14,15,16,17,18,2,3,5,2,6,3}));
        assertEquals(0, ArrayOperationTemplates.maxLengthSeria(new int[] {}));
    }

    @Test
    public void swapMatrixLine() {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6}
        };
        ArrayOperationTemplates.swapMatrixLine(data, 0, 1);
        assertArrayEquals(
                new int[][] {
                        {4, 5, 6},
                        {1, 2, 3}
                },
                data
        );
    }

    @Test
    public void swapColumns() {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        ArrayOperationTemplates.swapColumns(data, 0, 2);
        int[][] expected = {
                {3, 2, 1},
                {6, 5, 4},
                {9, 8, 7}
        };
        assertArrayEquals(expected, data);
    }

    @Test
    public void mergeTwoDimensArray() {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] out = ArrayOperationTemplates.mergeTwoDimensArray(input);
        assertArrayEquals(expected, out);
    }
}