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

    @Test
    public void union() {
        int[] left = {1, 2, 3, 4, 5};
        int[] middle = {6, 7, 8, 9, 10};
        int[] right = {11, 12, 13, 14, 15, 16};
        int[] rsl = ArrayOperationTemplates.unionThreeArrays(left, middle, right);
        int[] expected = {1, 11, 7, 13, 9, 15, 5};
        assertThat(rsl, is(expected));
    }

    @Test
    public void unionReturnArrayWith5Elements() {
        int[] left = {1, 2, 3};
        int[] middle = {4, 5, 6};
        int[] right = {7, 8, 9, 10};
        int[] rsl = ArrayOperationTemplates.unionThreeArrays(left, middle, right);
        int[] expected = {1, 7, 5, 9, 3};
        assertThat(rsl, is(expected));
    }

    @Test
    public void twoSquareArrays() {
        int[][] left = {{1, 10, 55}, {16, 32, 40}, {4, 27, 7}};
        int[][] right = {{2, 4, 92}, {82, 15, 26}, {8, 17, 35}};
        int[] expected = {2, 10, 92, 82, 32, 40, 8, 27, 35};
        int[] rsl = ArrayOperationTemplates.twoSquareArrays(left, right);
        assertThat(rsl, is(expected));
    }

    @Test
    public void convertArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[][] expected = {{1, 2, 3}, {4, 5, 6}, {7, 0, 0}};
        int[][] rsl = ArrayOperationTemplates.arrayInSquareArray(array);
        assertThat(rsl, is(expected));
    }

    @Test
    public void convertArray3Elements() {
        int[] array = {1, 2, 3};
        int[][] expected = {{1, 2}, {3, 0}};
        int[][] rsl = ArrayOperationTemplates.arrayInSquareArray(array);
        assertThat(rsl, is(expected));
    }

    @Test
    public void convertInSquareArray() {
        int[][] array = {{1}, {2, 3, 4}, {5, 6}, {7, 8, 9, 10, 11}};
        int[][] rsl = ArrayOperationTemplates.convertInSquareArray(array);
        int[][] expected = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 0}, {0, 0, 0, 0}};
        assertThat(rsl, is(expected));
    }

    @Test
    public void convertInSquareArrayWithout0() {
        int[][] array = {{1}, {2, 3}, {4, 5, 6}, {7, 8}, {9}};
        int[][] rsl = ArrayOperationTemplates.convertInSquareArray(array);
        int[][] expected = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertThat(rsl, is(expected));
    }

    @Test
    public void checkEvenSumArrayFalse() {
        int[] data = {1, 2, 3, 4, 5};
        boolean rsl = ArrayOperationTemplates.evenSumElementsInArray(data);
        assertThat(rsl, is(false));
    }

    @Test
    public void checkEvenSumArrayTrue() {
        int[] data = {1, 2, 3, 4, 5, 6, 7};
        boolean rsl = ArrayOperationTemplates.evenSumElementsInArray(data);
        assertThat(rsl, is(true));
    }

    @Test
    public void checkArrayFalse1() {
        int[] data = {1, 2, 1, 3, 1, 4, 1};
        int value = 1;
        boolean rsl = ArrayOperationTemplates.validator(data, value);
        assertThat(rsl, is(false));
    }

    @Test
    public void checkArrayTrue1() {
        int[] data = {1, 2, 3, 1, 4, 1, 5, 6, 7, 1, 8, 9};
        int value = 1;
        boolean rsl = ArrayOperationTemplates.validator(data, value);
        assertThat(rsl, is(true));
    }

    @Test
    public void changeData() {
        int[][] array = {{1, 8, 3}, {2, 4, 11}, {-10, 6, 5}};
        int el = 3;
        int[][] rsl = ArrayOperationTemplates.editorElementsArray(array, el);
        int[][] expected = {{0, 5, 0}, {0, 1, 8}, {0, 3, 2}};
        assertThat(rsl, is(expected));
    }
    @Test
    public void changeDataTwo() {
        int[][] array = {{5}, {1, 4}, {-10, 18, 9}, {3, 2, 7, 11}};
        int el = 3;
        int[][] rsl = ArrayOperationTemplates.editorElementsArray(array, el);
        int[][] expected = {{2}, {0, 1}, {0, 15, 6}, {0, 0, 4, 8}};
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectNewArray() {
        int[][] data = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int[] rsl = ArrayOperationTemplates.сheckSumIndexesInArray(data, 3);
        int[] expected = {1, 2, 3, 5, 6, 8, 9, 11, 12, 14, 15, 16};
        assertThat(rsl, is(expected));
    }

    @Test
    public void countNotEven() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int rsl = ArrayOperationTemplates.sumWithStopEl(data, 7);
        assertThat(rsl, is(0));
    }

    @Test
    public void countEven() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int rsl = ArrayOperationTemplates.sumWithStopEl(data, 5);
        assertThat(rsl, is(10));
    }
}