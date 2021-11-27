package JavaBacisCommand;

public class OperatorsDemo3 {
    public static void main(String[] args) {
        //Increment/decrement Operator
        //++ --
        //post pre
        //a++ a-- ++a --a
        int i = 5;
        System.out.println(i);
        ++i;//i = i + 1;
        System.out.println(i);

        int a = 7;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);

        int j = 9;
        int k = j++;
        System.out.println(j);
        System.out.println(k);

        int x = 7;
        x = (x++) + (++x) + x + 1;
        System.out.println(x);
    }
}
