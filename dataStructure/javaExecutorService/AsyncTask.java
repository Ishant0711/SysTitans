package dataStructure.javaExecutorService;

import java.util.concurrent.*;


public class AsyncTask {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
       learnCompletableFuture();
       System.out.println("Inside Main method");
        learnFuture();
       //learnThreadPoolExecutors();
    }

    static void learnThreadPoolExecutors(){
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4,6,
                2, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));
        for(int i =0; i< 100; i++) {
            threadPoolExecutor.submit(new LongRunningTask(i+""));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static void learnFuture() throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        Future<?> myNameFuture = executorService.submit(() -> {
            System.out.println("Inside name future " + Thread.currentThread().getName());
            getName();});
        var myNameFuture1 = executorService.submit(new LongRunningTask("Ishant"));
           // System.out.println("Inside name future " + Thread.currentThread().getName());
            myNameFuture.get();
            myNameFuture1.get();
        executorService.shutdown();  // because it may leak resource

    }

    static void learnCompletableFuture(){
        CompletableFuture<String> myNameCf = CompletableFuture.supplyAsync(() ->getName());

        myNameCf.thenAccept(name ->{
            System.out.println("Got the name inside completableFuture "+name);
        });
    }
    static String getName(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Ishant";
    }
}
