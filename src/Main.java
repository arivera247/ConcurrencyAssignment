import java.time.LocalTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LocalTime startTimeSingleThread = LocalTime.now();
        int[] numberTable = NumberTable.generateNumberTable();
        System.out.println(Arrays.toString(numberTable));

        LocalTime endTimeSingleThread = LocalTime.now();
        System.out.println("Single thread time: " + Math.abs(endTimeSingleThread.getNano() - startTimeSingleThread.getNano()));
    }
}



//Current PC has 8 cores and 16 threads