import java.time.LocalTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numberTableSingleThread = NumberTable.generateNumberTable();
        int[] numberTableMultiThread = NumberTable.generateNumberTable();


        LocalTime startTimeSingleThread = LocalTime.now();
        SingleThread.singleThreadAdd(numberTableSingleThread);

        LocalTime endTimeSingleThread = LocalTime.now();
        int singleThreadTimeCalc = Math.abs(endTimeSingleThread.getNano() - startTimeSingleThread.getNano());


        LocalTime startTimeMultiThread = LocalTime.now();
        MultiThread.multiThreadAdd(numberTableMultiThread);

        LocalTime endTimeMultiThread = LocalTime.now();
        int multiThreadTimeCalc = Math.abs(endTimeSingleThread.getNano() - startTimeSingleThread.getNano());



        System.out.println("Single thread time: " + singleThreadTimeCalc + " nanoseconds");
        System.out.println("Single thread sum: " + SingleThread.singleThreadAdd(numberTableSingleThread) + " units");


        System.out.println("Multi thread time: " + multiThreadTimeCalc + " nanoseconds");
        //System.out.println("Multi thread sum: " + MultiThread.multiThreadAdd(numberTableMultiThread) + " units");
        //FIXME - Multithread and SingleThread time values match, possible mixup sum and time values.
        //FIXME - Error void type value present in MultiThread class. "Error:java: 'void' type not allowed here"



    }
}



//Current PC has 8 cores and 16 threads