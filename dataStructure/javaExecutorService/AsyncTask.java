package dataStructure.javaExecutorService;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AsyncTask {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4,6,
                2, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));
        for(int i =0; i< 100; i++) {
            threadPoolExecutor.submit(new LongRunningTask(i+""));
            Thread.sleep(1000);
        }
    }
}
