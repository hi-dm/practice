package jvm;

/**
 -XX:NewSize=30m
 -XX:MaxNewSize=30m
 -XX:InitialHeapSize=200m
 -XX:MaxHeapSize=200m
 -XX:SurvivorRatio=1
 -XX:MaxTenuringThreshold=15
 -XX:PretenureSizeThreshold=20m
 -XX:+UseParNewGC
 -XX:+UseConcMarkSweepGC
 -XX:+PrintGCDetails
 -XX:+PrintGCTimeStamps
 -Xloggc:gc.log
 */
public class fiftyTest {
    static byte[] array1 = new byte[2 * 1024 * 1024];
    private byte[] array2 = new byte[1 * 1024 * 1024];

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(20000);
        for (int i = 0; i < 100; i++) {
            byte[] array3 = new byte[3 * 1024 * 1024];
            array3=null;
            byte[] array4 = new byte[3 * 1024 * 1024];
            array4=null;
            Thread.sleep(1000);
        }
    }
}
