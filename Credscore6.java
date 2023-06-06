import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); // credit score

        // Check if it is possible to access CRED programs
        if (x >= 750) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
