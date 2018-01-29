import static org.junit.Assert.*;

/**
 * Created by Bryce on 1/29/2018.
 */
public class StringCalculatorTest {
    StringCalculator stringCalculator = new StringCalculator();
    @org.junit.Test
    public void testAdd() throws Exception {
        //Null string
        String testString = "";
        assertEquals(0, stringCalculator.add(testString));

        //Sum of one number
        testString = "0";
        assertEquals(0, stringCalculator.add(testString));
        testString = "9";
        assertEquals(9, stringCalculator.add(testString));
        testString = "5";
        assertEquals(5, stringCalculator.add(testString));
    }
}