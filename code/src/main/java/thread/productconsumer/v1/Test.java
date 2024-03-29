package thread.productconsumer.v1;

import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue storage = new ArrayBlockingQueue(8);

        Producer producer =new Producer(storage);
        Thread producerThread = new Thread(producer);
        producerThread.start();
        Thread.sleep(500);

        Consumer consumer = new Consumer(storage);
        while (consumer.needMoreNums()){
            System.out.println(consumer.storage.take() + "被消费了");
            Thread.sleep(100);
        }
        System.out.println("消费者不需要更多数据了。");

        //一旦消费不需要更多数据了，我们应该让生产者也停下来，但是实际情况却停不下来(没有打印出生产者结束运行)
        //thread.interrupt()，通知线程中断； 2.线程内逻辑需配合响应中断：1）正常执行循环中使用 Thread.currentThread().isInterrupted()判断中断标识;
        producer.canceled = true;
        System.out.println(producer.canceled);
    }
}
