public class MultiThread {

    private int[] arrayNum;
    public static void multiThreadAdd(int[] arrayNum) {
        int threads = 16; // Number of threads
        for (int i = 0; i < threads; i++) {
            MultiThread myThreads = new MultiThread();
            myThreads.arrayNum = arrayNum;
            myThreads.arrayAdd();
        }
    }

    private int arrayAdd() {
        int sum = 0;
        for (int i = 0; i < arrayNum.length; i++) {
            sum += arrayNum[i];
        }
        return sum;
    }
}


//Reference: https://www.geeksforgeeks.org/multithreading-in-java/#