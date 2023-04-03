import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime startTimeSingleThread = LocalTime.now();
        for (int i = 0; i < 200000000; i++) {
            RNG.createRandomNumber();
        }
        LocalTime endTimeSingleThread = LocalTime.now();
        System.out.println("Single thread time: " + Math.abs(endTimeSingleThread.getNano() - startTimeSingleThread.getNano()));
    }
}



//Current PC has 8 cores and 16 threads