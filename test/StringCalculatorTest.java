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
        testString = "-123";
        assertEquals(-123, stringCalculator.add(testString));
        testString = "123";
        assertEquals(123, stringCalculator.add(testString));
        testString = "56547";
        assertEquals(56547, stringCalculator.add(testString));

        //Passing non numbers
        //Middle of lower valued characters
        try {
            testString = "#";
            stringCalculator.add(testString);
            fail();
        } catch (NumberFormatException e) {}
        try {
            testString = "/";
            stringCalculator.add(testString);
            fail();
        } catch (NumberFormatException e) {}
        try {
            testString = ":";
            stringCalculator.add(testString);
            fail();
        } catch (NumberFormatException e) {}
        try {
            testString = "A";
            stringCalculator.add(testString);
            fail();
        } catch (NumberFormatException e) {}

        //Sum of two numbers
        testString = "0,0";
        assertEquals(0, stringCalculator.add(testString));
        testString = "0,123";
        assertEquals(123, stringCalculator.add(testString));
        testString = "52,44";
        assertEquals(96, stringCalculator.add(testString));
        testString = "-123,0";
        assertEquals(-123, stringCalculator.add(testString));
        testString = "-123,123";
        assertEquals(0, stringCalculator.add(testString));

        //Sum of n numbers
        testString = "123,456,789,0";
        assertEquals(1368, stringCalculator.add(testString));
        testString = "-1000,500,400";
        assertEquals(-100, stringCalculator.add(testString));
        testString = "1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1";
        assertEquals(25, stringCalculator.add(testString));

        //testing git
        testString = "-1.-3,-6,10";
        assertEquals(0,stringCalculator.add(testString));
    }
}