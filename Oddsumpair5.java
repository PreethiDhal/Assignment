import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int a = scanner.nextInt(); // number A
            int b = scanner.nextInt(); // number B
            int c = scanner.nextInt(); // number C

            // Check if it is possible to choose exactly two numbers with odd sum
            if ((a + b) % 2 == 1 || (a + c) % 2 == 1 || (b + c) % 2 == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
