import javax.accessibility.Accessible;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Scanner;


public class AddORMultiply {

    public static void main(String[] args) {
        double numImput1 = Double.parseDouble(JOptionPane.showInputDialog("first number"));
        double numImput2 = Double.parseDouble(JOptionPane.showInputDialog("second number"));
        double result;

        if(numImput1 > numImput2){
           result = multiply(numImput1, numImput2);
        }
        if(numImput1 <= numImput2){
            result = add(numImput1, numImput2);
        }

        JOptionPane.showMessageDialog(null, "the result is:" + result);
    }

    public static double add(double num1, double num2){

        return num1 + num2;
    }
    public static double multiply(double num1, double num2){
        return num1 * num2;
    }



    /*
    Write two methods, one that adds two numbers and second that multiplies them.
    Then, write a main method that prompts the user to enter 2 numbers.

    If the first one is larger than the second, mutiply and display the result
    If not, add them and display the results.
     */
}
