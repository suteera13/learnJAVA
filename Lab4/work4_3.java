package Lab4;
// Suteera Sunakorn 6506021410020
import java.util.Scanner;
public class work4_3 {
  public static void main(String[] args){
    int num;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter number : ");
    num = scan.nextInt();
    if(num==1){
      System.out.println("Number "+ num +" is not prime number.");
    }
    else if(num==2 || num==3 || num==5 || num==7){
      System.out.println("Number "+ num +" is prime number.");
    }
    else if((num%2)==0 || (num%3)==0 || (num%5)==0 || (num%7)==0){
      System.out.println("Number "+ num +" is not prime number.");
    }else{
      System.out.println("Number "+ num +" is prime number.");
    }
  }
}