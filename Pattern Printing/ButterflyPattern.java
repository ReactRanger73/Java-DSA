import java.util.*;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int r = sc.nextInt();
        int n = r / 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = i + 1; k <= r - i; k++) {
                System.out.print(" ");
            }
            for (int l = r + 1 - i; l <= r; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = i + 1; k <= r - i; k++) {
                System.out.print(" ");
            }
            for (int l = r + 1 - i; l <= r; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

}
