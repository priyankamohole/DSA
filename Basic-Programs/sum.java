
import java.util.Scanner;

public class sum {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no");
        int a = sc.nextInt();
        System.out.println("Enter no");
        int b = sc.nextInt();

        int sum = a * b;
        System.out.println(sum);

        // String name = sc.next();
        // System.out.println(name);
        sc.close();
    }
}
