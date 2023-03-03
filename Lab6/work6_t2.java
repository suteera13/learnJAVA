package Lab6;
import javax.swing.*;
public class work6_t2 {
    public static void main(String[] args){
        String name[] = new String[10];
        int score[] = new int[10];
        int choice, i = 0;
        String input1, input2, input3, textScore = "";
        while(i!=-1){
            int  j=0;
            showScore(textScore);
            input1 = JOptionPane.showInputDialog("Main menu\n===========\n"
                + "1.Set new score\n2.Show average score\n"
                + "3.Show minimum score\n4.Show maximum\n5.Exit");
            choice = Integer.parseInt(input1);
            if(choice==5){
                JOptionPane.showMessageDialog(null
                    , "Exit program", "suteera", 1);
                break;
            }
            else if(choice==1){
                i = 0;
                textScore = "";
                while(j<10){
                    input2 = JOptionPane.showInputDialog("Enter in 'x' to exit"
                        + "\nEnter name [" + i + "]");
                    name[i] = input2;
                    switch(name[i]){
                        case "x" : j=10;
                        break;
                        default:
                            input3 = JOptionPane.showInputDialog("Enter score [" + i + "]");
                            score[i] = Integer.parseInt(input3);
                            if(score[i] < 0 || score[i] > 100 ){
                                JOptionPane.showMessageDialog(null
                            , "Please re-enter.", "That's not", 2);
                            }else{
                                textScore += name[i] + " : " + score[i] + "\n";
                                i++;
                                for(int l=0; l<j; l++) System.out.print(l + name[l] + " ");
                                System.out.println();
                            }
                    }
                }
            }
            else if(choice==2){
                String textAve = "Average score : " + getAverage(score,i);
                JOptionPane.showMessageDialog(null, textAve);
            }
            else if(choice==3){
                int scoreMin = getMinimum(score,i);
                String textMin = "";
                for(int r=0; r<i; r++){
                    if(scoreMin==score[r]){
                        textMin = "Student name : " + name[r] 
                            + "\n" + "Minimum score : " + scoreMin;
                    }
                }
                // String textMin = "Minimum score : " + getMinimum(score,i);
                JOptionPane.showMessageDialog(null, textMin);
            }
            else if(choice==4){
                int scoreMax = getMaximum(score,i);
                String textMax = "";
                for(int r=0; r<i; r++){
                    if(scoreMax==score[r]){
                        textMax = "Student name : " + name[r] 
                            + "\n" + "Maximum score : " + scoreMax;
                    }
                }
                JOptionPane.showMessageDialog(null, textMax);
            }
        }
        System.exit(0);
    }
    public static void showScore(String textScore){
        JFrame window = new JFrame("student score"); // create window
        JLabel head = new JLabel(">> score <<"); // text header
        JTextArea textArea = new JTextArea(textScore); // input area

        head.setBounds(80,0,100,30);
        textArea.setBounds(65,30, 100,200);
        window.add(head); 
        window.add(textArea);
        window.setSize( 250,300);
        window.setLayout(null);
        window.setVisible(true); // show window
    }
    public static Double getAverage(int score[], int num){
        Double sum = 0.0;
        for(int i=0; i<num; i++){
            sum += score[i];
        }
        System.out.println(sum);
        System.out.println(sum/num);
        return sum/num;
    }
    public static int getMinimum(int score[], int num){
        int min = 101;
        for(int i=0; i<num; i++){
            if(min > score[i]) min = score[i];
        }
        return min;
    }
    public static int getMaximum(int score[], int num){
        int max = 0;
        for(int i=0; i<num; i++){
            if(max < score[i]) max = score[i];
        }
        return max;
    }
}
