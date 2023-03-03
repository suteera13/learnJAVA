package Lab5;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class work5_3 {
    public static void main(String[] args){
        int i= 0;
        int value[] = new int[100];
        String mes1, messenger = "";
        value[0] = 0;
        while(value[i]!=-1){
            mes1 = JOptionPane.showInputDialog("Enter number :");
            value[i] = Integer.parseInt(mes1);
            if(value[i]==-1) break;
            i++;
        }
        for(int j=0; j<i; j++){
            messenger += value[j] + " : " + printChar(value[j]) + "\n";
        }
        JOptionPane.showMessageDialog(null, messenger
            , "Histogram", JOptionPane.INFORMATION_MESSAGE);
    }
    public static String printChar(int n){
        String txt = "";
        for(int i=0; i<n; i++){
            txt += "*";
        }
        return txt;
    }
}
