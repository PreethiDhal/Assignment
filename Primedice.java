import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        
        while (T-- > 0) {
            int A = scanner.nextInt(); // Alice's throw
            int B = scanner.nextInt(); // Bob's throw
            
            String winner = determineWinner(A, B);
            
            System.out.println(winner);
        }
        
        scanner.close();
    }
    
    private static String determineWinner(int A, int B) {
        int sum = A + B;
        
        if (isPrime(sum)) {
            return "Alice";
        } else {
            return "Bob";
        }
    }
    
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}

