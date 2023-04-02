import java.util.Scanner;

public class Main3 {
    public static void isPrime(int N){
        if (N < 2) {
            System.out.println("Composite");
            return;
        }
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                System.out.println("Composite");
                return;
            }
        }
        System.out.println("Prime");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        isPrime(N);
    }
}
