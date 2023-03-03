import javax.swing.JOptionPane;
public class hilo {
    public static void main(String[] args){
        int player, choice, answers1, answers2, answers3, bet = 1;
        String input1, input2, input3;
        input1 = JOptionPane.showInputDialog("Hilo Game"
            +"\nEnter player number");
        player = Integer.parseInt(input1);

        for(int j = 0; j < bet; j++){
            input1 = JOptionPane.showInputDialog("Enter bet");
            bet = Integer.parseInt(input1);
            if(bet==-1){
                break;
            }
            String win = "Earn "+ bet +" Baht.";
            String winn = "Earn "+ bet*6 +" Baht.";
            String lose = "Lose"+ bet +" Baht Bet";
            int dice1 = 1 + (int)(Math.random() * 6);
            int dice2 = 1 + (int)(Math.random() * 6);
            int dice3 = 1 + (int)(Math.random() * 6);
            // int sum = dice1 + dice2 + dice3;

            for(int i = 1; i <= player; i++){
                input2 = JOptionPane.showInputDialog(
                    "Player : "+ i +"\nChoose your choice\n0 : Guess the sum of the 3 dice.\n"
                    +"1 : Guess the dice of the 3 dice.");
                choice = Integer.parseInt(input2);
                if(choice==0){
                    input3 = JOptionPane.showInputDialog("\nEnter in the sum of the 3 dice.");
                    answers1 = Integer.parseInt(input3);
                    if(check(answers1,dice1,dice2,dice3)==1){
                        JOptionPane.showMessageDialog(null, "You win.");
                        JOptionPane.showMessageDialog(null, win);
                    }else{
                        JOptionPane.showMessageDialog(null, "You lose.");
                        JOptionPane.showMessageDialog(null, lose);
                    }
                }
                else if(choice==1){
                    input3 = JOptionPane.showInputDialog("Enter the results of 3 dice.\nSample : 1 2 3");
                    answers1 = Integer.parseInt(input3);
                    input3 = JOptionPane.showInputDialog("Enter the results of 3 dice.\nSample : 1 2 3");
                    answers2 = Integer.parseInt(input3);
                    input3 = JOptionPane.showInputDialog("Enter the results of 3 dice.\nSample : 1 2 3");
                    answers3 = Integer.parseInt(input3);
                    if(compare(answers1,answers2,answers3,dice1,dice2,dice3)==1){
                        JOptionPane.showMessageDialog(null, "You win.");
                        JOptionPane.showMessageDialog(null, winn);
                    }else{
                        JOptionPane.showMessageDialog(null, "You lose.");
                        JOptionPane.showMessageDialog(null, lose);
                    }
                }else{
                    i = i-1;
                }
            }
            JOptionPane.showMessageDialog(null, "Answer sum");
            JOptionPane.showMessageDialog(null, dice1+dice2+dice3);
            JOptionPane.showMessageDialog(null, "Answer dice");
            JOptionPane.showMessageDialog(null, dice1);
            JOptionPane.showMessageDialog(null, dice2);
            JOptionPane.showMessageDialog(null, dice3);
        }
    }
    public static int check(int answer, int d1, int d2, int d3){
        if(answer == d1+d2+d3){
            return 1;
        }else return 0;
    }
    public static int compare(int a1, int a2, int a3, int d1, int d2, int d3){
        if(a1 == d1 && a1 == d2 && a1 == d3){
            if(a2 == d1 && a2 == d2 && a2 == d3){
                if(a3 == d1 && a3 == d2 && a3 == d3){
                    return 1;
                }else return 0;
            }else return 0;
        }else return 0;
    }
}
