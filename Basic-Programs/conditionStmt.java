import java.util.*;

public class conditionStmt {
    public static void main(String arg[]) {
        // conditional statements
        Scanner sc = new Scanner(System.in);
        int a = 16;
        int b = 10;
        int c = 89;
        if (a >= b) {
            System.out.println("A is greater");
        } else {
            System.out.println("b is greater");
        }
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number id odd");
        }

        // else if
        // if(){
        // }else if(){
        // }else{}

        // income tax cal
        // income <5L - 0% tax
        // income between 5-10L - 20% tax
        // income > 10L - 30% tax

        int in = sc.nextInt();
        float tax;
        if (in < 500000) {
            tax = 0;
        } else if (in >= 500000 && in < 1000000) {
            tax = (float) (in * 0.2);
        } else {
            tax = (float) (in * 0.3);
        }
        System.out.println("Your tax is :" + tax);

        // larger btn 3 no
        if (a > b && a > c) {
            System.out.println("A is large");
        } else if (b > c) {
            System.out.println("B  is large");
        } else {
            System.out.println("C is large");
        }

        // ternary optr
        String type = (5 % 2 == 0) ? "even" : "odd";
        System.out.println(type);
    }
}
