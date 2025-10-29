import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int r = sc.nextInt();
        int n = r / 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= r - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= r - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
