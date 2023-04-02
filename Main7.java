import java.util.Scanner;

public class Main7 {
    public static void reverse(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start+1, end-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++){
            array[i] = scanner.nextInt();
        }
        reverse(array, 0, N-1);
        for (int i : array){
            System.out.print(i + " ");
        }
    }
}
