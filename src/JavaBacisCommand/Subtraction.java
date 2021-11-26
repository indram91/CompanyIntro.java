package JavaBacisCommand;

import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int a = input.nextInt();
        System.out.println("Enter number2: ");
        int b = input.nextInt();
        int sub = a - b;
        System.out.println("Subtraction of "+a+" and " +b+ " is " + sub);
    }
}
