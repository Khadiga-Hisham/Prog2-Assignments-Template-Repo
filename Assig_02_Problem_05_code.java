//Khadiga_Hisham
//20216215
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int X = sc.nextInt();
            boolean isPrime = true;
            if (X == 0 || X == 1) {
                isPrime = false;
            } else {
                for (int i = 2; i * i <= X; i++) {
                    if (X % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not");
            }
        }
    }
}
