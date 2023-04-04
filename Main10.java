import java.util.Scanner;

public class Main10 {
    /*
        @getGcd - find gcd of 2 numbers
        @param1 - integer number (a)
        @param2 - integer number (b)
        @return - gcd (integer)
    */
    public static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return getGcd(b, a % b);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getGcd(scanner.nextInt(), scanner.nextInt()));
    }
}
