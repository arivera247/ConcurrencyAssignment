import java.time.LocalTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numberTable = NumberTable.generateNumberTable();
        SingleThread.singleThreadAdd(numberTable);
        System.out.println("Single thread time: " + SingleThread.singleThreadAdd(numberTable) + " nanoseconds");
        //System.out.println(Arrays.toString(numberTable));


        //System.out.println("Single thread time: " + Math.abs(endTimeSingleThread.getNano() - startTimeSingleThread.getNano()));


    }
}



//Current PC has 8 cores and 16 threads