import javax.swing.*;
import java.text.DecimalFormat;

public class Payroll {

    /*
    This program should calculate an employee's pay
    which includes overtime pay.

    Overtime pay is any hours over 40 gets a wage equal
    to 1.5 times base wage.

    BASE WAGE: 12.50
    OVERTIME WAGE: 18.75

    HOURS WORKED: 50
    HOURS: 40 NORMAl, 10 OVERTIME
    PAY: 40 * 12.50 + 10 * 18.75 = 687.50

    Let's output this in proper currency form.
     */

    public static void main(String[] args) {
        double wage = input("what is your hourly rate?");
        double hours = input("how many hour worked");

        if(hours > 40) {
            output(OvtimeWage(hours, wage));
        }else{
            output(NormWage(hours, wage));
        }

    }

    public static double NormWage(double Hours, double Wage){
        return Hours * Wage;

    }
    public static double OvtimeWage(double Hours, Double Wage){
        double Overtime = Hours - 40;

        return (40 * Wage) + Overtime * (Wage * 1.5);

    }

    public static double input(String prompt){
        return Double.parseDouble(JOptionPane.showInputDialog(prompt));

    }
    public static void output(double wage){
        DecimalFormat round = new DecimalFormat("$#,###.00");
        JOptionPane.showMessageDialog(null, "you've earned " + round.format(wage));

    }

}
