import java.util.*;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number ");
        // int inc = sc.nextInt();
        // int cont = 1;
        // int sum = 0;
        // while (cont <= inc) {
        // // System.out.println(cont);
        // sum += cont;
        // cont++;
        // }
        // System.out.println(sum);

        // for (int line = 1; line <= 4; line++) {
        // System.out.println("****");
        // }
        // int l = 1;
        // while (l <= 4) {
        // System.out.println("****");
        // l++;
        // }

        // int n = 10899;
        // int rev = 0;
        // while (n > 0) {
        // int lastdig = n % 10;
        // System.out.println(lastdig);
        // rev = (rev * 10) + lastdig;
        // n = n / 10;
        // }
        // System.out.println(rev);

        // int count = 1;
        // do {
        // System.out.println("hello");
        // count++;
        // if (count == 3)
        // break;
        // } while (count <= 5);
        // System.out.println("i am out of the loop");

        do {
            System.out.println("Enter Number : ");
            int n = sc.nextInt();
            if (n % 10 == 0)
                break; // continue - skip iteration
            System.out.println(n);
        } while (true);

    }
}
