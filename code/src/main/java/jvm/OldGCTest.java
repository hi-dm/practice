package jvm;

public class OldGCTest {
    public static void main(String[] args) {
        byte[] array1 = new byte[2 * 1024 * 1024];
        array1 = new byte[2 * 1024 * 1024];
        array1 = new byte[2 * 1024 * 1024];
        array1 = null;

        byte[] array2 = new byte[128 * 1024];
        byte[] array3 = new byte[2 * 1024 * 1024];
        array3 = new byte[2 * 1024 * 1024];
        array3 = new byte[2 * 1024 * 1024];
        array3 = new byte[128 * 1024];
        array3 = null;

        byte[] array4 = new byte[2 * 1024 * 1024];


    }

    //TODO: lock here :JVM 配置
/*
-XX:NewSize=10m
-XX:MaxNewSize=10m
-XX:InitialHeapSize=20m
-XX:MaxHeapSize=20m
-XX:SurvivorRatio=8
-XX:MaxTenuringThreshold=15
-XX:PretenureSizeThreshold=10m
-XX:+UseParNewGC
-XX:+UseConcMarkSweepGC
-XX:+PrintGCDetails
-XX:+PrintGCTimeStamps
-Xloggc:gc.log
*/


//log

    /*Java HotSpot(TM) 64-Bit Server VM (25.251-b08) for bsd-amd64 JRE (1.8.0_251-b08), built on Mar 12 2020 02:36:37 by "java_re" with gcc 4.2.1 (Based on Apple Inc. build 5658) (LLVM build 2336.11.00)
    Memory: 4k page, physical 16777216k(290728k free)

/proc/meminfo:

    CommandLine flags: -XX:InitialHeapSize=20971520 -XX:MaxHeapSize=20971520 -XX:MaxNewSize=10485760 -XX:MaxTenuringThreshold=15 -XX:NewSize=10485760 -XX:OldPLABSize=16 -XX:PretenureSizeThreshold=10485760 -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:SurvivorRatio=8 -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC -XX:+UseParNewGC
0.164: [GC (Allocation Failure) 0.164: [ParNew: 7808K->549K(9216K), 0.0016736 secs] 7808K->549K(19456K), 0.0017657 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
    Heap
    par new generation   total 9216K, used 2761K [0x00000007bec00000, 0x00000007bf600000, 0x00000007bf600000)
    eden space 8192K,  27% used [0x00000007bec00000, 0x00000007bee29108, 0x00000007bf400000)
    from space 1024K,  53% used [0x00000007bf500000, 0x00000007bf589640, 0x00000007bf600000)
    to   space 1024K,   0% used [0x00000007bf400000, 0x00000007bf400000, 0x00000007bf500000)
    concurrent mark-sweep generation total 10240K, used 0K [0x00000007bf600000, 0x00000007c0000000, 0x00000007c0000000)
    Metaspace       used 2856K, capacity 4496K, committed 4864K, reserved 1056768K
    class space    used 310K, capacity 388K, committed 512K, reserved 1048576K*/
}
