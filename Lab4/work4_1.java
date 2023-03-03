package Lab4;
// Suteera Sunakorn 6506021410020
import java.util.Scanner;
public class work4_1 {
  public static void main(String[] args){
    int start, end, num;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the first number : ");
    start = scan.nextInt();
    System.out.print("Enter the final number : ");
    end = scan.nextInt();
    
    while(start <= end){
      if((start % 3)==0 && (start % 5)==0){
        System.out.print(start + " ");
      }
      start = start + 1;
    }
    // end while
  }
}
