import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int x = scanner.nextInt(); // bill amount before discount

            // Calculate the discount for each coupon option
            int discount1 = x / 10; // 10% off discount
            int discount2 = 100; // Rs. 100 flat discount

            // Determine the maximum discount
            int maxDiscount = Math.max(discount1, discount2);
            System.out.println(maxDiscount);
        }
    }
}
