import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Iterate through each test case
        for (int i = 0; i < T; i++) {
            // Read N and M for the current test case
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            // Calculate the total number of balls remaining
            int totalBalls = M * 6;

            // Calculate the maximum number of runs that can be scored
            int totalRunsPossible = totalBalls * 6;

            if (N <= totalRunsPossible) {
                System.out.println("YES");  // Chef's team can win the game
            } else {
                System.out.println("NO");  // Chef's team cannot win the game
            }
        }
    }
}
