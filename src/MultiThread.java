public class MultiThread {

    private int[] arrayNum;
    private int arrayAdd() {
        int sum = 0;
        for (int i = 0; i < arrayNum.length; i++) {
            sum += arrayNum[i];
        }
        return sum;
    }

    public static void multiThreadAdd(int[] arrayNum) {
        int threads = 16; // Number of threads
        int sum = 0;
        for (int i = 0; i < threads; i++) {
            MultiThread myThreads = new MultiThread();
            myThreads.arrayNum = arrayNum;
            sum = myThreads.arrayAdd();
        }
        System.out.println("Multi thread sum: " + sum + " units");
        //FIXME - Add this statment to Main class.
    }
}


//Reference: https://www.geeksforgeeks.org/multithreading-in-java/#