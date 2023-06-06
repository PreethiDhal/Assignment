import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int a = scanner.nextInt(); // Alice's amount
            int b = scanner.nextInt(); // Bob's amount
            int c = scanner.nextInt(); // Charlie's amount
            int x = scanner.nextInt(); // Netflix subscription cost

            // Check if any two of them can contribute to buy a subscription
            if ((a + b >= x) || (a + c >= x) || (b + c >= x)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
