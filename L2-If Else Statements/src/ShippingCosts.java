import javax.swing.*;

public class ShippingCosts {


    public static void main(String[] args) {
        double Shipping;
        int Distance = Integer.parseInt(JOptionPane.showInputDialog("distance traveled"));
        double weight = Double.parseDouble(JOptionPane.showInputDialog("weight of object"));
        double cost;

        if (weight >= 10) {
            Shipping = 4.80;
        } else {
            if (weight >= 6) {
                Shipping = 3.70;
            } else {
                if (weight >= 2) {
                    Shipping = 2.20;
                } else {
                    Shipping = 1.10;
                }
                public static double cost ( double rate, int miles ){

                    int costMultiplier = miles / 100;
                    if (costMultiplier == 0) {
                        costMultiplier = 1;

                    }
                    return rate * cost;
                }
            }



    /*
    A Shipping Company charges the following rates
    for each 100 miles shipped:

    2lbs or less ..................... $1.10
    over 2lbs but less than 6lbs ..... $2.20
    over 6lbs but less than 10lbs .... $3.70
    over 10lbs ....................... $4.80

    Write a program to calculate the shipping price. The
    distance is not prorated, in other words, the price doesn't
    increase until the next 100 miles, i.e. 150 miles for a 3lbs
    package is still just $2.20.

    Example Run:
    Weight: 5.6lbs
    Distance: 345 miles
    Price: $6.60

    As always, your program should include a method.
     */


        }
    }
}
