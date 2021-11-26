package JavaBacisCommand;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter byte value: ");
        byte b = input.nextByte();
        System.out.println("Enter short value: ");
        short s = input.nextShort();
        System.out.println("Enter int value: ");
        int i = input.nextInt();
        System.out.println("Enter long value: ");
        long l = input.nextLong();

        System.out.println("Enter float value: ");
        float f = input.nextFloat();
        System.out.println("Enter double value: ");
        double d = input.nextDouble();

        System.out.println("Enter char value: ");
        char ch = input.next().charAt(0);

        System.out.println("Enter boolean value: ");
        boolean bb = input.nextBoolean();
//        System.out.println("Enter string value: ");
//        String sss = input.nextLine();
        System.out.println("Enter string value: ");
        String ss = input.nextLine();

        System.out.println("byte value is: " + b);
        System.out.println("short value is: " + s);
        System.out.println("int value is: " + i);
        System.out.println("long value is: " + l);
        System.out.println("float value is: " + f);
        System.out.println("double value is: " + d);
        System.out.println("char value is: " + ch);
        System.out.println("boolean value is: " + bb);
        System.out.println("String value is: " + ss);
//        System.out.println("String value is: " + sss);

    }
}
