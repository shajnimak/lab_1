import java.util.Scanner;

public class Main6 {
    public static double po(double a, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return a * po(a,n-1);
        } else {
            return 1/ a * po(a, n+1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(po(scanner.nextDouble(), scanner.nextInt()));
    }
}
