//Khadiga_Hisham
//20216215
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            
            int c = a + b;
            a = b;
            b = c;
        }
    }
}