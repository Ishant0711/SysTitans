package dataStructure.javaExecutorService;

public class LongRunningTask implements Runnable{
    String cmd;
    public LongRunningTask(String cmd){
        this.cmd =cmd;
    }
    @Override
    public void run() {
        try{
            Thread.sleep(4);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Starting task "+cmd + Thread.currentThread().getName());
    }
}
