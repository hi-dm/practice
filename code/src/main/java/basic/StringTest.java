package basic;

public class StringTest {
    public static void integerInner(Integer x) {
        x = 6;
    }

    public static void stringInner(String x) {
        x = "6";
    }

    public static void main(String[] args) {
        Integer x = new Integer(4);
        integerInner(x);
        System.out.println(x);

        String y=new String("5");
        stringInner(y);
        System.out.println(y);

    }

    public static void change(Employee param) {
        param.setName("c");
        param = new Employee("b");
    }
}
