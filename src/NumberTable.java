import java.util.Arrays;

public class NumberTable {
    public static int[] generateNumberTable() {
        int[] arrayNum = new int[200000000];
        for (int i = 0; i < 200000000; i++) {
            arrayNum[i] = RNG.createRandomNumber();
        }

        return arrayNum;
        }
        //FIXME - create unit test to check if the array is populated with random numbers.
        //FIXME - create unit test to check if the array is populated with 200,000,000 numbers. Expecting result +-1.
}