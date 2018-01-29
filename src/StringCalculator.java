/**
 * Created by Bryce on 1/29/2018.
 */
public class StringCalculator {
    static int add(String numbers) {
        //Make sure the string is not empty
        if (numbers.isEmpty()) {
            return 0;
        }

        //Calculate the sum
        String[] separated = numbers.split(",");
        int sum = 0;
        for (int i = 0; i < separated.length; i++) {
            //Add the value of the current number to the sum
            sum += Integer.parseInt(separated[i]);
        }
        return sum;
    }
}
