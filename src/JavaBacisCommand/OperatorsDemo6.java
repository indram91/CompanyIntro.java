package JavaBacisCommand;

public class OperatorsDemo6 {
    public static void main(String[] args) {
        //Conditional(ternary) operator ?:
        int a = 5;
        int b = 6;
        if (a > b){
            System.out.println("a is greater then b.");
    } else {
        System.out.println("b is greater then a.");
    }
    String s = (a > b)? "a is greater then b." : "b is greater then a.";
        System.out.println(s);
    }
}
