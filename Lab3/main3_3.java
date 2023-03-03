package Lab3;
import java.util.Scanner;
public class main3_3 {
  public static void main(String[] args){
    String num;
    Scanner n = new Scanner(System.in);

    for(int i=0; i<1; i++){
      System.out.print("Enter nuber : ");
      num = n.nextLine();

      if(num.length() < 5){
        // แยกอักขระ
        func3_3.Fragmented(num);
        break;
      }else{
        System.out.println("Please enter a four-digit number.");
        i = -1;
      }
    } //end for
  }
}
        