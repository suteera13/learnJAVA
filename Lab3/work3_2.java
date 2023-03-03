package Lab3;
import java.util.Scanner;
public class work3_2 {
    public static void main(String[] args){
        double Principal, Interate;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Principal : ");
        Principal = scan.nextDouble();
        System.out.print("Enter Interate : ");
        Interate = scan.nextDouble();

        double deposit = Principal / 100 * Interate + Principal;
        for(int y=1; y<6; y++){
            System.out.println("Year " + y + " : " + deposit);
            deposit = deposit / 100 * Interate + deposit;
        }
    }
}