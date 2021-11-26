package JavaBacisCommand;

public class LiteralsDemo {
    public static void main(String[] args) {
        //Literals: a source code representation of fixed value
        //Literals => fixed value + data type

        //1. Integer Literals: 435 57858769 8798089090
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l1 = 2147483647L;
        long l2 =-9223372036854775808L;

        //2.floating Literals 23.45 45.567 (double)
        float f = 23.45F;
        double d = 23.45;
        //3. Boolean Literals true false
        boolean b1 = true;
        boolean b2 = false;
        //4. Character Literals:
        char c1 = '1';
        char c2 = 'a';
        char c3 = '?';
        char c4 = '\u0000';

        //5. String Literals:
        String s1 = "a";
        String s2 = "Hello";
        String s3 = "abc@123#$we";
        String s4 = "Hello, this is Indra. ";
        String s5 = "123";
        String s6 = "23.45";
        String s7 = "true";
        String s8 = "";
        String s9 = " ";

        //6 Null Literals
        String s10 = null;
        LiteralsDemo ob = new LiteralsDemo(); //this is an object
        LiteralsDemo obj = null;
    }
}
