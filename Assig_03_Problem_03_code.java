//Khadiga_Hisham
//20216215
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 1;
        int gap = 3;

        for (int i = 1; i <= n; i++) {
            System.out.print(num + " ");
            System.out.print(num+1 + " ");
            System.out.print(num+2 + " ");
            System.out.println("PUM");
            num += gap + 1;
        }
    }
}
