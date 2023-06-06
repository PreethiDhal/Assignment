import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int a = scanner.nextInt(); // minimum power required per year
            int b = scanner.nextInt(); // number of years
            int x = scanner.nextInt(); // total grams of Helium-3
            int y = scanner.nextInt(); // power generated per gram of Helium-3

            int totalPower = x * y; // total power generated from available Helium-3
            if (totalPower >= a * b) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
