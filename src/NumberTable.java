import java.util.Arrays;

public class NumberTable {
    public static int[] generateNumberTable() {
        int[] arrayNum = new int[200000000];
        for (int i = 0; i < 200000000; i++) {
            arrayNum[i] = RNG.createRandomNumber();
        }

        return arrayNum;
        }
}