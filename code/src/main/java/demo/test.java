package demo;

public class test {
    public static void main(String[] args) {
        System.out.println((1l& (1L << 12) )> 0);
        System.out.println((2l& (1L << 12) )> 0);
        System.out.println((3l& (1L << 12) )> 0);
        System.out.println((1000l& (1L << 12) )> 0);
        System.out.println((100000000000l& (1L << 12) )> 0);
        System.out.println((200000000000l& (1L << 12) )> 0);
        System.out.println((000000000000l& (1L << 12) )> 0);

    }
}
