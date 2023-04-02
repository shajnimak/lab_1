import java.util.Scanner;

public class Main10 {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(gcd(scanner.nextInt(), scanner.nextInt()));
    }
}
