import java.util.Scanner;

public class Main2 {
    public static void av(int N){
        int[] array = new int[N];
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < N; i++){
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        double av = sum/N;
        System.out.println(av);
    }
    public static void main(String[] args) {
        System.out.println("Welcome!");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        av(N);
    }
}
