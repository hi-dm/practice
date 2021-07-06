package thread;

public class StopThread implements Runnable {
    @Override
    public void run() {
        int count=0;
        while (!Thread.currentThread().isInterrupted() && count<1000){
            System.out.println("count="+ count++);
            try {
                Thread.sleep(1000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread =new Thread(new StopThread());
        thread.start();
        Thread.sleep(5);
        thread.interrupt();
    }
}
