package Lab3;
import java.util.Scanner;
public class main3_2 {
    public static void main(String[] args){
        double Principal, Interate;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Principal : ");
        Principal = scan.nextDouble();
        System.out.print("Enter Interate : ");
        Interate = scan.nextDouble();
        
        for(int y=1; y<6; y++){
            Principal = func3_2.calDeposit(Interate,Principal);
            System.out.println("Year " + y + " : " + Principal);
        }
    }
}