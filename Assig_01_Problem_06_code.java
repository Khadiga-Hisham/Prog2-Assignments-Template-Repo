//Khadiga_Hisham
//20216215
import java.util.Scanner;
public class JavaApplication31 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int X; 
    do { 
      X = sc.nextInt(); 
    } while (X < 1000 || X > 9999); 
    while (X >= 10) { 
      X /= 10; 
    }
    System.out.println(X % 2 == 0 ? "EVEN" : "ODD"); 
  }
}