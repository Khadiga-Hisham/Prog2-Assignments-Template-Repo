//Khadiga_Hisham
//20216215
import java.util.Scanner;
public class DifferenceCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();
    long D = sc.nextLong();
    long difference = (A * B) - (C * D);
    System.out.println("Difference = " + difference);
  }
}
