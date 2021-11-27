package JavaBacisCommand;

public class OperatorsDemo5 {
    public static void main(String[] args) {
       //Logical Operator: &&(and) || (or) !(not)
        int a = 6;
        int b = 7;
        int c = 9;
        System.out.println((a < b) && (b < c)); //true
        System.out.println((a < b) && (b > c)); //false
        System.out.println((a > b) && (b < c)); //false
        System.out.println((a > b) && (b > c)); //false

        System.out.println("================");
        System.out.println((a < b) || (b < c)); //true
        System.out.println((a < b) || (b > c)); //true
        System.out.println((a > b) || (b < c)); //true
        System.out.println((a > b) || (b > c)); //false

        System.out.println("=================");
        System.out.println(!(a > b)); //true
        System.out.println(!(a < b)); //false
    }
}
