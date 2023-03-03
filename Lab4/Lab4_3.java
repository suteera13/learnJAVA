package Lab4;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Lab4_3 {
    int total;
    int counter;
    int score;
    double average;
    public static void main(String[] args) {
        Lab4_3 test = new Lab4_3();
        Scanner scan = new Scanner(System.in);
        test.total = 0;
        test.counter = 0;
        System.out.print( "Enter Integer Score or -1 to Quit:" );
        test.score = scan.nextInt();
        while (test.score != -1) {
            test.tt();
            test.cc();
            System.out.print("Enter Integer Score or -1 to Quit:" );
            test.score = scan.nextInt();
        }
        DecimalFormat twoDigits = new DecimalFormat( "0.00" );
        if (test.counter != 0) {
            test.ave();
            System.out.println( "Class average is " + twoDigits.format( test.average ));
        }else{
            System.out.println( "No scores were entered" );
        }
    }
    public int tt(){
        return total = total + score;
    }
    public int cc(){
        return counter = counter + 1;
    }
    public double ave(){
        return average = (double) total / counter;
    }
}
