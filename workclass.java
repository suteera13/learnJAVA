import java.util.Scanner;
public class workclass {
    public static void main(String[] args) {
        int num1,num2,num3, min=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers:  ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        min = numbercheck(num1, num2, num3, min);
        System.out.print("Minimum value :  " +  min);
    }

    public static int numbercheck(int num1, int num2, int num3,int min){
        if(num1 < num2){
            if(num1 < num3) {
                min = num1;
            }else{
                min = num3;
            }
        }else{
            if(num2 < num3) {
                min = num2;
            }else{
                min = num3;
            }
        }
       
        return min;

    }
}
