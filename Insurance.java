import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        
        while (T-- > 0) {
            int X = scanner.nextInt(); // Maximum rebatable amount in lakhs
            int Y = scanner.nextInt(); // Amount required for repairing in lakhs
            
            int rebate = calculateRebate(X, Y);
            
            System.out.println(rebate);
        }
        
        scanner.close();
    }
    
    private static int calculateRebate(int X, int Y) {
        if (Y <= X) {
            return Y;
        } else {
            return X;
        }
    }
}
