//Khadiga_Hisham
//20216215
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read the input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print positions and values less than or equal to 10
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 10) {
                System.out.println("A[" + i + "] = " + arr[i]);
            }
        }
    }
}
