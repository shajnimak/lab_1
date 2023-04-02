
import java.util.Scanner;

public class Main {
    public static void min(int N){
        int[] array = new int[N];
        int min = 99999999;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < N; i++){
            array[i] = scanner.nextInt();
            if (min>array[i])
                min = array[i];
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        System.out.println("Welcome!");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        min(N);
    }
}
