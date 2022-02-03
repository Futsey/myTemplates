package collectionTemplates.arrayList;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ListOperationTemplatesTest {

    @Test
    public void whenGetNull() {
        List<String> list = new ArrayList<>();
        String result = ListOperationTemplates.checkerAhdGetter(list);
        String expected = "";
        assertThat(result, is(expected));
    }

    @Test
    public void whenGetFirstElement() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        String result = ListOperationTemplates.checkerAhdGetter(list);
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
}