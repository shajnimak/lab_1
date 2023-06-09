import java.util.Scanner;

public class Main8 {
    /*
        @findDigit - checking for a digit
        @param - string (s)
        @return - void method, but output "Yes/No"
    */
    public static void findDigit(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        findDigit(str);
    }
}
