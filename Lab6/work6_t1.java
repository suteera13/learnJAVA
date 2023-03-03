package Lab6;
import javax.swing.*;
public class work6_t1 {
    public static void main(String[] args){
        int score[] = new int[10];
        int i = 1, choice;
        String input, textScore = "";
        while(i!=0){
            showScore(textScore);
            input = JOptionPane.showInputDialog("Main menu\n===========\n"
                + "1.Set new score\n2.Show average score\n"
                + "3.Show minimum score\n4.Show maximum\n5.Exit");
            choice = Integer.parseInt(input);
            if(choice==5){
                JOptionPane.showMessageDialog(null
                    , "Exit program", "suteera", 1);
                break;
            }
            else if(choice==1){
                textScore = "";
                for(int j=0; j<10; j++){
                    score[j] = setScore();
                    textScore += score[j] + "\n";
                }
            }
            else if(choice==2){
                String textAve = "Average score : " + getAverage(score);
                JOptionPane.showMessageDialog(null, textAve);
            }
            else if(choice==3){
                String textMin = "Minimum score : " + getMinimum(score);
                JOptionPane.showMessageDialog(null, textMin);
            }
            else if(choice==4){
                String textMax = "Maximum score : " + getMaximum(score);
                JOptionPane.showMessageDialog(null, textMax);
            }
        }
        System.exit(0);
    }
    public static int setScore(){ 
        return (1 + (int) (Math.random() * 100));
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
    public static Double getAverage(int score[]){
        Double sum = 0.0;
        for(int i=0; i<10; i++){
            sum += score[i];
        }
        System.out.println(sum);
        System.out.println(sum/10);
        return sum/10;
    }
    public static int getMinimum(int score[]){
        int min = 101;
        for(int i=0; i<10; i++){
            if(min > score[i]) min = score[i];
        }
        return min;
    }
    public static int getMaximum(int score[]){
        int max = 0;
        for(int i=0; i<10; i++){
            if(max < score[i]) max = score[i];
        }
        return max;
    }
}