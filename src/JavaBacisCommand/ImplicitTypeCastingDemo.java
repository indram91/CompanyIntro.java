package JavaBacisCommand;

public class ImplicitTypeCastingDemo {
    public static void main(String[] args) {
       //byte => short => int => long => float => Double =>
        byte b =127;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
}
