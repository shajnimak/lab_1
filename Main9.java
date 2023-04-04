import java.util.Scanner;

public class Main9 {
    /*
        @getCoef - find binomial coefficient of two numbers
        @param1 - integer number (n)
        @param2 - integer number (k)
        @return - 1 integer number(binomial coefficient)
    */
    public static int getCoef(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return getCoef(n-1, k-1) + getCoef(n-1, k);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getCoef(scanner.nextInt(),scanner.nextInt()));
    }
}
