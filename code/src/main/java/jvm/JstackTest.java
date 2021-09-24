package jvm;

/**
 * 54 讲，用Jstack 工具
 */
public class JstackTest {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(60000);
        while (true){
            loadData();
        }
    }
    private static void loadData() throws InterruptedException {
        byte[] data = null;
        for (int i = 0; i < 4; i++) {
            data = new byte[10 *1024 *1024];

        }
        data = null;

        byte[] data1 =new byte[10 * 1024*1024];
        byte[] data2 =new byte[10 * 1024*1024];
        byte[] data3 =new byte[10 * 1024*1024];
        data3 = new byte[10*1024*1024];

        Thread.sleep(1000);

        // jstack -gc "PID" 10000 50  每隔1秒打印一次 共打印50次

    }
}
