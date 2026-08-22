import java.util.*;

//narrowing
public class typecasting {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        // long a = 4; // 8byte long
        // float b = sc.nextInt(); // 4byte int implicit

        float a = 9.45f; // explicit
        int b = (int) a;
        System.out.println(b);

        byte b = 5;
        byte a = (byte) (b * 2); // expression give int value by default
        System.out.println(a);

    }
}

// byte->short->int->float->long->double
// automatic -> implicit
// forcefully -> explicit
// char-> int
