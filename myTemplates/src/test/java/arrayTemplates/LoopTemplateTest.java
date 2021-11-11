package arrayTemplates;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;;

public class LoopTemplateTest {

    @Test
    public void whenHasUppercase() {
        LoopTemplate string = new LoopTemplate();
        String expected = "ST";
        assertThat(string.collect("StringTest"), is(expected));
    }

        @Test
    public void collect() {
        String s = "North Atlantic Treaty Organization";
        String rsl = LoopTemplate.collect(s);
        assertThat(rsl, is("NATO"));
    }

    @Test
    public void collect1() {
        String s = "Chief Executive Officer";
        String rsl = LoopTemplate.collect(s);
        assertThat(rsl, is("CEO"));
    }

    @Test
    public void collect2() {
        String s = "United Nations Organization";
        String rsl = LoopTemplate.collect(s);
        assertThat(rsl, is("UNO"));
    }

}