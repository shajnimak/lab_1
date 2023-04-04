import java.util.Scanner;

public class Main6 {
    /*
        @findPower - find the power of two numbers
        @param - double number (a), integer number (n)
        @return - powered value(double)
    */
    public static double findPower(double a, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return a * findPower(a,n-1);
        } else {
            return 1/ a * findPower(a, n+1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(findPower(scanner.nextDouble(), scanner.nextInt()));
    }
}
