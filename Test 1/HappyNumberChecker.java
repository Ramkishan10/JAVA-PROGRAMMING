package placement_training;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        boolean isHappy = isHappyNumber(n);
        System.out.println("Is " + n + " a happy number? " + isHappy);
        scanner.close();
    }
    private static boolean isHappyNumber(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNextHappyNumber(n);
        }
        return n == 1;
    }
    private static int getNextHappyNumber(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
