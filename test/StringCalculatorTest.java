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
        testString = "5";
        assertEquals(5, stringCalculator.add(testString));
        testString = "9";
        assertEquals(9, stringCalculator.add(testString));

        //Passing non numbers
        //Middle of lower valued characters
        testString = "#";
        assertEquals(0, stringCalculator.add(testString));
        //Lower bound for check
        testString = "/";
        assertEquals(0, stringCalculator.add(testString));
        //Upper bound for check
        testString = ":";
        assertEquals(0, stringCalculator.add(testString));
        //Middle of higher valued characters
        testString = "A";
        assertEquals(0, stringCalculator.add(testString));

        //Sum of two numbers
        testString = "0,0";
        assertEquals(0, stringCalculator.add(testString));
        testString = "0,9";
        assertEquals(9, stringCalculator.add(testString));
        testString = "5,4";
        assertEquals(9, stringCalculator.add(testString));
        testString = "9,0";
        assertEquals(0, stringCalculator.add(testString));
        testString = "9,9";
        assertEquals(18, stringCalculator.add(testString));

        //Passing non numbers
        testString = "#,0";
        assertEquals(0, stringCalculator.add(testString));
        testString = "/,0";
        assertEquals(0, stringCalculator.add(testString));
        testString = ":,0";
        assertEquals(0, stringCalculator.add(testString));
        testString = "A,0";
        assertEquals(0, stringCalculator.add(testString));
        testString = "0,#";
        assertEquals(0, stringCalculator.add(testString));
        testString = "0,/";
        assertEquals(0, stringCalculator.add(testString));
        testString = "0,:";
        assertEquals(0, stringCalculator.add(testString));
        testString = "0,A";
        assertEquals(0, stringCalculator.add(testString));
        testString = "#,#";
        assertEquals(0, stringCalculator.add(testString));
        testString = "/,/";
        assertEquals(0, stringCalculator.add(testString));
        testString = ":,:";
        assertEquals(0, stringCalculator.add(testString));
        testString = "A,A";
        assertEquals(0, stringCalculator.add(testString));

        
    }
}