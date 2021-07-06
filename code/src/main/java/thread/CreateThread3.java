package thread;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * 通过线程池 传入一个有返回值的Callable
 * 本质还是12 的创建方式
 */
public class CreateThread3 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt();
    }
}
//创建线程池
//ExecutorService service = Executors.newFixedThreadPool(10);
//提交任务，并用 Future提交返回结果
//Future<Integer> future = service.submit(new CallableTask());


