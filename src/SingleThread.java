import java.time.LocalTime;
public class SingleThread {
    public static int singleThreadAdd(int[] arrayNum) {

        int sum = 0;
        for (int i = 0; i < arrayNum.length; i++) {
            sum += arrayNum[i];
        }
        return sum;
        }
}
