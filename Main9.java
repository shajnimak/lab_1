import java.util.Scanner;

public class Main9 {
    public static int coef(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return coef(n-1, k-1) + coef(n-1, k);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(coef(scanner.nextInt(),scanner.nextInt()));
    }
}
