import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Iterate through each test case
        for (int i = 0; i < T; i++) {
            // Read the start time for the current test case
            int X = scanner.nextInt();

            // Calculate the time when Janmansh will finish all assignments
            int finishTime = X + 3;

            if (finishTime <= 10) {
                System.out.println("Yes");  // Janmansh can complete the assignments on time
            } else {
                System.out.println("No");  // Janmansh cannot complete the assignments on time
            }
        }
    }
}
