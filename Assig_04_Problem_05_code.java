//Khadiga_Hisham
//20216215
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); 

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            int minSum = Integer.MAX_VALUE;
            for (int j = 1; j < n; j++) {
                for (int k = 0; k < j; k++) {
                    int sum = arr[j] + arr[k] + j - k;
                    if (sum < minSum) {
                        minSum = sum;
                    }
                }
            }
            System.out.println(minSum);
        }
    }
}
