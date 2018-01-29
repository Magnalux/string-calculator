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

        String[] separated = numbers.split(",");
        int sum = Integer.parseInt(separated[0]);

        if (separated.length == 2) {
            sum += Integer.parseInt(separated[1]);

        }
        return sum;
    }
}
