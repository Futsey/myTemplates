package collectionTemplates.arrayList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ListOperationTemplatesTest {

    private List<String> list = new ArrayList<>();
    private List<String> list1 = new ArrayList<>();

    @Test
    public void whenGetNull() {
        List<String> list = new ArrayList<>();
        String result = ListOperationTemplates.checkerAndGetter(list);
        String expected = "";
        assertThat(result, is(expected));
    }

    @Test
    public void whenGetFirstElement() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        String result = ListOperationTemplates.checkerAndGetter(list);
        String expected = "first";
        assertThat(result, is(expected));
    }

    @Test
    public void addNewElement() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        boolean result = ListOperationTemplates.addNewElement(list, "fourth");
        assertThat(result, is(true));
    }

    @Test
    public void addNewElementTrue() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        boolean result = ListOperationTemplates.addIndexElement(list, 1, "fourth");
        assertThat(result, is(true));
    }

    @Test
    public void addNewElementFalse() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        boolean result = ListOperationTemplates.addIndexElement(list, 1, "second");
        assertThat(result, is(false));
    }

    @Test
    public void checkListTrue() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        boolean result = ListOperationTemplates.uniqueElement(list, "second");
        assertThat(result, is(true));
    }

    @Test
    public void checkListFalse() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("second");
        list.add("fourth");
        boolean result = ListOperationTemplates.uniqueElement(list, "second");
        assertThat(result, is(false));
    }

    @Test
    public void checkListNoContainsElement() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        boolean result = ListOperationTemplates.uniqueElement(list, "fourth");
        assertThat(result, is(false));
    }

    @Before
    public void setUpChangePosition() {
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
    }

    @Test
    public void changePosition() {
        int index = 3;
        List<String> result = ListOperationTemplates.repositionElement(list, index);
        assertThat(result.size(), is(8));
        assertThat(result.get(index), is("nine"));
    }

    @Test
    public void changePositionNone() {
        int index = 20;
        List<String> result = ListOperationTemplates.repositionElement(list, index);
        assertThat(result.size(), is(8));
        assertThat(result.contains("nine"), is(false));
    }

    @Test
    public void containsElement() {
        List<String> left = new ArrayList<>();
        left.add("first");
        left.add("second");
        left.add("third");
        List<String> right = new ArrayList<>();
        right.add("fourth");
        right.add("second");
        right.add("fifth");
        String check = "second";
        int result = ListOperationTemplates.addAllElementsList(left, right, check);
        assertThat(result, is(3));
    }

    @Test
    public void containsElementInFirstList() {
        List<String> left = new ArrayList<>();
        left.add("first");
        left.add("second");
        left.add("third");
        List<String> right = new ArrayList<>();
        right.add("fourth");
        right.add("fifth");
        String check = "second";
        int result = ListOperationTemplates.addAllElementsList(left, right, check);
        assertThat(result, is(1));
    }

    @Test
    public void split() {
        List<String> left = new ArrayList<>();
        left.add("one");
        left.add("two");
        left.add("three");
        left.add("four");
        left.add("five");
        left.add("six");
        left.add("seven");
        left.add("eight");
        left.add("nine");
        left.add("ten");
        List<String> middle = List.of(
                "one", "two", "four", "five", "seven", "eight", "nine"
        );
        List<String> right = List.of(
                "two", "five", "nine"
        );
        List<String> rsl = ListOperationTemplates.splitterList(left, middle, right);
        assertThat(rsl, is(List.of("one", "four", "seven", "eight")));
    }

    @Before
    public void setUpGetElementsBetweenIndexes() {
        list1.add("one");
        list1.add("two");
        list1.add("three");
        list1.add("four");
        list1.add("five");
        list1.add("six");
        list1.add("seven");
        list1.add("eight");
        list1.add("three");
        list1.add("ten");
    }

    @Test
    public void getElementsBetweenIndexes() {
        List<String> result = ListOperationTemplates.getElementsBetweenIndexes(list1, "three");
        List<String> expected = List.of("three", "four", "five", "six", "seven", "eight");
        assertThat(result, is(expected));
    }

    @Test
    public void getElementsBetweenIndexesEmptyList() {
        List<String> result = ListOperationTemplates.getElementsBetweenIndexes(list1, "five");
        List<String> expected = List.of();
        assertThat(result, is(expected));
    }
}