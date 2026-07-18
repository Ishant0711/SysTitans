public class DemoThread {

    public static void main(String[] args) throws InterruptedException {

        Thread n1 = new Thread(() ->{
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            int n =0;
            while (n++ < 80) {
                System.out.println("n1 thread is running  : " +Thread.currentThread().getName());
            }
        }
        );
        Thread n2 = new Thread( () ->{
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            int m =0;
            while(m++ <100) {
                System.out.println("n2 thread is running : " + Thread.currentThread().getName() );
            }
        }
        );
        n1.start();
        n2.start();
    }
}
