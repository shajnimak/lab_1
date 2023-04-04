import java.util.Scanner;

public class Main5 {
    /*
        @findFactorial - find findFibonacci of number
        @param - integer number (n)
        @return - integer number
    */
    public static int findFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return findFibonacci(n-1) + findFibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(findFibonacci(scanner.nextInt()));
    }
}
