/**
 * Created by Bryce on 1/29/2018.
 */
public class StringCalculator {
    static int add(String numbers) {
        //Make sure the string is not empty
        if (numbers.isEmpty()) {
            return 0;
        }

        //Getting the numeric value of a character

        char currentChar = numbers.charAt(0);
        if (currentChar < '0' || currentChar > '9') {
            //The current character is not a number so the string cannot be summed
            return 0;
        }

        int sum = currentChar - '0';

        return sum;
    }
}
