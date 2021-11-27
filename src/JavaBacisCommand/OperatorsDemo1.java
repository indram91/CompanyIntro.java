package JavaBacisCommand;

public class OperatorsDemo1 {
    public static void main(String[] args) {
        //Arithmetic Operators: + - / * %
        //precedence + -(low) / * %(high)
        //Associativity: left to Right

        int a = 4 + 5 - 7 / 3 - 3 * 2 + 7 % 3;
//         a = 4 + 5 - 7 / 3 - 3 * 2 + 7 % 3;
//         a = 4 + 5 - 2 - 3 * 2 + 7 % 3;
//         a = 4 + 5 - 2 - 6 + 7 % 3;
//         a = 4 + 5 - 2- 6 + 1;
//         a = 9 - 2 - 6 + 1;
//         a = 7 - 6 + 1;
//         a = 1 + 1;
//         a = 2;
        System.out.println(a);
    }
}
