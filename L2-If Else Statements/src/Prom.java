import javax.swing.*;

public class Prom {


    public static void main(String[] args) {
        int Gradelevel = Integer.parseInt(JOptionPane.showInputDialog("what your grade level (9, 10, 11, 12)"));
        int disciple = Integer.parseInt(JOptionPane.showInputDialog("how many suspensions"));
        int Pay = Integer.parseInt((JOptionPane.showInputDialog("how much moneys")));

        if(Gradelevel >= 11){
         if(disciple >= 1){
          System.out.println("access denied");
         }else{
             System.out.println("access denied");
         }

        }else{
            if(Pay >= 40){
               System.out.println("access granted");
            }else{
                System.out.println("access denied");
            }

         System.out.println("access denied");
        }
    }



    /* In order to purchase a ticket to go to prom,
    you must be a Junior or Senior, have no disciplinary
    records and have $40 to pay for it.
     */


}
