import com.revature.app.Solution;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testBrackets1() {
        String s = "abc.abc";
        Solution sl = new Solution();

        assertEquals("abc[.]abc", sl.brackets(s));
    }

    @Test
    public void testBrackets2() {
        String s = "a.bc.ab.c";
        Solution sl = new Solution();

        assertEquals("a[.]bc[.]ab[.]c", sl.brackets(s));
    }

    @Test
    public void testBrackets3() {
        String s = ".";
        Solution sl = new Solution();

        assertEquals("[.]", sl.brackets(s));
    }

    @Test
    public void testBrackets4() {
        String s = "";
        Solution sl = new Solution();

        assertEquals("", sl.brackets(s));
    }

    @Test
    public void testBrackets5() {
        String s = "abc";
        Solution sl = new Solution();

        assertEquals("abc", sl.brackets(s));
    }
}