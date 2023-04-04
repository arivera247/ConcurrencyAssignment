import java.time.LocalTime;
public class SingleThread {
    public static int singleThreadAdd(int[] arrayNum) {

        int sum = 0;

        LocalTime startTimeSingleThread = LocalTime.now();

        for (int i = 0; i < arrayNum.length; i++) {
            sum += arrayNum[i];
        }

        LocalTime endTimeSingleThread = LocalTime.now();
        int timeCalc = Math.abs(endTimeSingleThread.getNano() - startTimeSingleThread.getNano());

        return sum;
        //return timeCalc;
        //FIXME - Need to add time calculation
    }
}
