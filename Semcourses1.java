import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int x = scanner.nextInt(); // number of courses
            int y = scanner.nextInt(); // number of units per course
            int z = scanner.nextInt(); // number of chapters per unit

            int totalChapters = x * y * z;
            System.out.println(totalChapters);
        }
    }
}
