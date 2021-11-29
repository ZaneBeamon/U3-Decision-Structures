import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Random;
public class QuizGame {





    static double userAnswer, correctAnswer;
    static String Display = "";
    JPanel panel;
    JButton newPRBLM, Check;
    JTextField Input;
    JLabel PRBLM, Results, ShowPRBLM;
    JRadioButton Add, Sub, Multiply, Divide;
    JTextField text;

    public static void main(String[] args) {

        PRBLM();
        Results();
        Check();
    }
    public QuizGame() {
        JFrame frame = new JFrame("Quiz Game");
        frame.setSize(300, 450);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        Add = new JRadioButton("Add");
        Sub = new JRadioButton("Sub");
        Multiply = new JRadioButton("Multiply");
        Divide = new JRadioButton("Divide");
        ButtonGroup radio = new ButtonGroup();
        newPRBLM = new JButton(" Calculate");
        ShowPRBLM = new JLabel("");
        Check = new JButton(" checking....");


        Add.setBounds(50, 10,200,30);
        Sub.setBounds(50, 40, 200, 30);
        Multiply.setBounds(50, 70, 200, 30);
        Divide.setBounds(50, 100, 200, 30);
        newPRBLM.setBounds(50, 130, 150, 25);
        ShowPRBLM.setBounds(50,130, 200, 25);
        Check.setBounds(50, 130, 200, 25);

        radio.add(Add);
        radio.add(Sub);
        radio.add(Multiply);
        radio.add(Divide);
        newPRBLM.addActionListener(new PRBLMchoice());
        

        panel.add(Add);
        panel.add(Sub);
        panel.add(Multiply);
        panel.add(Divide);
        panel.setLayout(null);
        panel.add(newPRBLM);
        panel.add(ShowPRBLM);
        panel.add(Input);
        panel.add(Check);
        panel.add(Results);

        frame.add(panel);
        frame.setVisible(true);
    }
    private class PRBLMchoice implements ActionListener{
        @Override
        public void actionPerformed(ActionListener actionListener){
            if(Add.isSelected()){
                AddPRBLM();
            }
            if(Sub.isSelected()){
                SubPRBLM();
            }
            if(Multiply.isSelected()){
                MultiPRBLM();
            }
            if(Divide.isSelected()){
                DividePRBLM();
            }

            ShowPRBLM.setText(Display);
        }
    }

    public static void Results(){
        JOptionPane.showMessageDialog(null, Display);
    }
    public static void PRBLM(){
        double choice = input("Choose: \nAdd(1), \nSubtract(2), \nMultiply(3), \nDivide(4)");

        if(choice <= 4){
            if(choice >= 1){}
            if(choice == 1){
             AddPRBLM();}
            if(choice == 2){
                SubPRBLM();
            }
            if(choice == 3){
                MultiPRBLM();
            }
            if(choice == 4){
                DividePRBLM();
            }

        }else{
            JOptionPane.showMessageDialog(null, "Invalid option");
            System.exit(0);

        }
        public static void Answer(){

            userAnswer = Double.parseDouble(userAnswer.getText());
        }
        public static void Check(){
            if(userAnswer == correctAnswer){
                Display = " Correct";
            }else{

                Display = " incorrect";
            }
        }
    }

    public static void AddPRBLM(){
        int number1 = random();
        int number2 = random();

        correctAnswer = number1 + number2;
        Display = number1 + " + " + number2;
    }
    public static void SubPRBLM(){

        int number1 = random();
        int number2 = random();

        correctAnswer = number1 - number2;
        Display = number1 + " - " + number2;
    }
    public static void MultiPRBLM(){

        int number1 = random();
        int number2 = random();

        correctAnswer = number1 * number2;
        Display = number1 + " * " + number2;
    }
    public static void DividePRBLM(){

        int number1 = random();
        int number2 = random();

        correctAnswer = (double)number1 / number2;
        correctAnswer = Math.round(correctAnswer * 100)/100.0;

        System.out.println(correctAnswer);
        Display = number1 + " / " + number2;
    }

    public static int random(){
        Random random = new Random();
        return random.nextInt(30) + 1;
    }
    public static double input(String message){

        return Double.parseDouble(JOptionPane.showInputDialog(message));
    }
}
