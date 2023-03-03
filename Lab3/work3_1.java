package Lab3;
import java.util.Scanner;
public class work3_1 {
    public static void main(String[] args){
        double c,f;
        Scanner Celsius = new Scanner(System.in);
    
        System.out.print("Enter Temperature Celsius : ");
        c = Celsius.nextDouble();
        f = c*9/5+32;
        System.out.print("Fahrenheit : "+ f);
    }
}