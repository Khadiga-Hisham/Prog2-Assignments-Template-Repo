//Khadiga_Hisham
//20216215
import java.util.Scanner;

public class JavaAppication29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        int max, mid, min;

        if (A > B) {
            if (A > C) {
                max = A;
                if (B > C) {
                    mid = B;
                    min = C;
                } else {
                    mid = C;
                    min = B;
                }
            } else {
                max = C;
                mid = A;
                min = B;
            }
        } else {
            if (B > C) {
                max = B;
                if (A > C) {
                    mid = A;
                    min = C;
                } else {
                    mid = C;
                    min = A;
                }
            } else {
                max = C;
                mid = B;
                min = A;
            }
        }

        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
        System.out.println();
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
