import java.util.*;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("Prime");
        } else {
            boolean prime = true;
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    System.out.println("Not prime");
                    prime = false;
                }
            }
            if (prime == true) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }

        }

    }
}
