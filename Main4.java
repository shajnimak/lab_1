import java.util.Scanner;

public class Main4 {
    /*
        @findFactorial - find factorial of number
        @param - integer number (n)
        @return - integer number
    */
    public static int findFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * findFactorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(findFactorial(N));
    }
}
