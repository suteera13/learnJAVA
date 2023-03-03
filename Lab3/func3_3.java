package Lab3;

public class func3_3 {
  public static void Fragmented(String N){
    String[] arrOfStr = N.split("");
    for (String a : arrOfStr){
        System.out.print(a + "   ");
    }
  }
}
