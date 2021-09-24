package jvm;
/*
-XX:ThreadStackSize=1m
*/
public class stackTest {

    static int n=0;
    public static void main(String[] args) {
        work();
    }

    private static void work() {
        System.out.println("第"+ (++n));
        work();
    }
}
