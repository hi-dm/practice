package jvm;

public class GCTest {

    /*
    -XX:NewSize=100m
    -XX:MaxNewSize=100m
    -XX:InitialHeapSize=200m
    -XX:MaxHeapSize=200m
    -XX:SurvivorRatio=8
    -XX:MaxTenuringThreshold=15
    -XX:PretenureSizeThreshold=20m
    -XX:+UseParNewGC
    -XX:+UseConcMarkSweepGC
    -XX:+PrintGCDetails
    -XX:+PrintGCTimeStamps
    -Xloggc:gc.log
    */
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(30000);
        //60M 无用对象
        byte[] array1 = new byte[10 * 1024 * 1024];
        array1 = new byte[10 * 1024 * 1024];
        array1 = new byte[10 * 1024 * 1024];
        array1 = new byte[10 * 1024 * 1024];
        array1 = new byte[10 * 1024 * 1024];
        array1 = new byte[10 * 1024 * 1024];

        array1 = null;
        //
        Thread.sleep(2000);
        byte[] array2 = new byte[4 * 1024 * 1024];
        byte[] array3 = new byte[4 * 1024 * 1024];
        Thread.sleep(2000);
        byte[] array6 = new byte[13 * 1024 * 1024];
        Thread.sleep(12000);
      /*  byte[] array3 = new byte[4 * 1024 * 1024];

        //触发GC
        byte[] array6 = new byte[13 * 1024 * 1024];

        array6=null;
        byte[]  array7 = new byte[16 * 1024 * 1024];
        byte[]  array8 = new byte[16 * 1024 * 1024];
        byte[]  array9 = new byte[16 * 1024 * 1024];
        byte[]  array10 = new byte[16 * 1024 * 1024];
        byte[]  array11 = new byte[16 * 1024 * 1024];*/
    }
}
