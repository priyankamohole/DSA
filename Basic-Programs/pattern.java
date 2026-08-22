import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for (int line = 1; line <= 4; line++) {
        // for (int star = 1; star <= line; star++) {
        // System.out.print(star); // *
        // }
        // System.out.println();
        // }

        // for (int line = 1; line <= 4; line++) {
        // for (int star = 1; star <= 4 - line + 1; star++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // a bc def ghij
        int n = 4;
        char ch = 'A';

        for (int line = 1; line <= n; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++; // cut the back character or increament char
            }
            System.out.println();
        }
    }
}
