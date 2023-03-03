package Lab5;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.text.DecimalFormat;
public class work5_1 {
    public static void main(String[] args){
        double num, total, ave;
        String mes1, messenger;
        mes1 = JOptionPane.showInputDialog("Enter number of score :");
        num = Double.parseDouble(mes1);
        total = getScore(num);
        ave = average(num,total);
        DecimalFormat twoDigit = new DecimalFormat("0.00");
        messenger = "Average score is "+ twoDigit.format(average(num,total));
        JOptionPane.showMessageDialog(null, messenger
            , "Result", JOptionPane.INFORMATION_MESSAGE);
    }
    public static double getScore(double n){
        double total = 0;
        String mes2;
        for(int i = 0; i < n; i++){
            mes2 = JOptionPane.showInputDialog("Enter score "+(i+1)+" :");
            total += Double.parseDouble(mes2);
        }
        return total;
    }
    public static double average(double n, double a){
        return a/n;
    }
}
