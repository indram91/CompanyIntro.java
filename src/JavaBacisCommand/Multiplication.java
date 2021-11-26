package JavaBacisCommand;

import javax.swing.*;

public class Multiplication {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter number1: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter number2: "));
        int mul = a * b;
        JOptionPane.showMessageDialog(null, "Multiplication of the a and b is: " + mul);
    }
}
