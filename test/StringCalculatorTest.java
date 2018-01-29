import static org.junit.Assert.*;

/**
 * Created by Bryce on 1/29/2018.
 */
public class StringCalculatorTest {
    StringCalculator stringCalculator = new StringCalculator();
    @org.junit.Test
    public void testAdd() throws Exception {
        String testString = "";
        assertEquals(0, stringCalculator.add(testString));

    }
}