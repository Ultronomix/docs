import com.revature.app.Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {

    @Test
    public void testRecurringString1() {
        String s = "aabaab";
        Solution sl = new Solution();

        Assert.assertEquals(true, sl.recurringSubstring(s));
    }

    @Test
    public void testRecurringString2() {
        String s = "aabaaba";
        Solution sl = new Solution();

        Assert.assertEquals(false, sl.recurringSubstring(s));
    }

    @Test
    public void testRecurringString3() {
        String s = "abcabcabc";
        Solution sl = new Solution();

        Assert.assertEquals(true, sl.recurringSubstring(s));
    }

    @Test
    public void testRecurringString4() {
        String s = "a";
        Solution sl = new Solution();

        Assert.assertEquals(false, sl.recurringSubstring(s));
    }

    @Test
    public void testRecurringString5() {
        String s = "";
        Solution sl = new Solution();

        Assert.assertEquals(false, sl.recurringSubstring(s));
    }

}