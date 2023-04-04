import java.time.LocalTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        LocalTime startTimeSingleThread = LocalTime.now();
        int[] numberTable = NumberTable.generateNumberTable();
        SingleThread.singleThreadAdd(numberTable);
        LocalTime endTimeSingleThread = LocalTime.now();
        int singleThreadTimeCalc = Math.abs(endTimeSingleThread.getNano() - startTimeSingleThread.getNano());

        System.out.println("Single thread time: " + singleThreadTimeCalc + " nanoseconds");
        System.out.println("Single thread sum: " + SingleThread.singleThreadAdd(numberTable) + " units");

    }
}



//Current PC has 8 cores and 16 threads