package jvm;

public class YoungGcTest {
    //
    public static void main(String[] args) {
        byte[] array1 = new byte[1024 * 1024];
        array1 = new byte[1024 * 1024];
        array1 = new byte[1024 * 1024];
        array1 = null;

        byte[] array2 = new byte[2 * 1024 * 1024];
    }

    //配置
        /*-XX:NewSize=5m
        -XX:MaxNewSize=5m
        -XX:InitialHeapSize=10m
        -XX:MaxHeapSize=10m
        -XX:SurvivorRatio=8
        -XX:PretenureSizeThreshold=10m
        -XX:+UseParNewGC
        -XX:+UseConcMarkSweepGC
        -XX:+PrintGCDetails
        -XX:+PrintGCTimeStamps
        -Xloggc:gc.log*/


    //log
    /*CommandLine flags: -XX:InitialHeapSize=10485760 -XX:MaxHeapSize=10485760 -XX:MaxNewSize=5242880 -XX:NewSize=5242880 -XX:OldPLABSize=16 -XX:PretenureSizeThreshold=10485760 -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:SurvivorRatio=8 -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC -XX:+UseParNewGC
0.184: [GC (Allocation Failure) 0.184: [ParNew: 3381K->425K(4608K), 0.0034518 secs] 3381K->1451K(9728K), 0.0035748 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
    Heap
    par new generation   total 4608K, used 3618K [0x00000007bf600000, 0x00000007bfb00000, 0x00000007bfb00000)
    eden space 4096K,  77% used [0x00000007bf600000, 0x00000007bf91e4e8, 0x00000007bfa00000)
    from space 512K,  83% used [0x00000007bfa80000, 0x00000007bfaea4d8, 0x00000007bfb00000)
    to   space 512K,   0% used [0x00000007bfa00000, 0x00000007bfa00000, 0x00000007bfa80000)
    concurrent mark-sweep generation total 5120K, used 1026K [0x00000007bfb00000, 0x00000007c0000000, 0x00000007c0000000)
    Metaspace       used 2845K, capacity 4496K, committed 4864K, reserved 1056768K
    class space    used 308K, capacity 388K, committed 512K, reserved 1048576K*/

}
