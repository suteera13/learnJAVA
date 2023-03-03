package Lab5;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class work5_2 {
    public static void main(String[] args){
        long num;
        String mes1;
        mes1 = JOptionPane.showInputDialog("Enter number :");
        num = Long.parseLong(mes1);
        
        String messenger = "Number digit of "+ num 
        + " is " + countDigit(num) + " digits";
        JOptionPane.showMessageDialog(null, messenger
            , "Result", JOptionPane.INFORMATION_MESSAGE);
    }
    public static long countDigit(long n){
        String num = ""+n;
        int value = num.length();
        return value;
    }
}
