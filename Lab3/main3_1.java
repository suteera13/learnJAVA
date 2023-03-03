package Lab3;

import java.util.Scanner;
public class main3_1 {
    public static void main(String[] args){
        double c, f;
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter c : ");
        c = scan.nextDouble();
        System.out.print("Enter f : ");
        f = scan.nextDouble();

        double returnc = func3_1.celsius(c);
        double returnf = func3_1.fahrenheit(f);

        System.out.print("celsius : " +returnc);
        System.out.print("\nfahrenheit : " +returnf);
    }
}
