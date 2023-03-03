import java.util.Scanner;
public class grade{
  public static void main(String[] args) {
    String name, g;
    double score_c1, score_c2, score_c3;
    Scanner names = new Scanner(System.in);
    Scanner score = new Scanner(System.in);

    System.out.print("Enter name : ");
    name = names.next();
    System.out.print("Enter Courses Score 1 : ");
    score_c1 = score.nextDouble();
    System.out.print("Enter Courses Score 2 : ");
    score_c2 = score.nextDouble();
    System.out.print("Enter Courses Score 3 : ");
    score_c3 = score.nextDouble();

    System.out.printf("\nName : "+ name +"");
    // CalC(score_c1,g);
    System.out.print("\nGrade Courses 1 : ");
    CalC(score_c1);
    System.out.print("\nGrade Courses 1 : ");
    CalC(score_c2);
    System.out.print("\nGrade Courses 1 : ");
    CalC(score_c3);
    
  }
  public static void CalC(double sc){
    if(sc<50)
      System.out.print("F");
    else if(sc<60)
      System.out.print("D");
    else if(sc<70)
      System.out.print("C");
    else if(sc<80)
      System.out.print("B");
    else if(sc<101)
      System.out.print("A");
    else
      System.out.print("None");
  }
}