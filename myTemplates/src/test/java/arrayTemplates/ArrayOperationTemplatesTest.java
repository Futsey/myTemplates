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

}