public class operater {
    public static void main(String arg[]) {
        // arithmatic binary (+ - * / %) unary (++ --)
        int a = 10;
        int b = 5;
        System.out.println("Sum is :" + (a + b));
        System.out.println("Sub is :" + (a - b));

        // unary ++ --
        int c = ++a; // a++ as it is value then change
        int d = --a;
        System.out.println("Increament :" + c);
        System.out.println("Decreament :" + d);

        // relational (== != > < >= <=)
        System.out.println(a == b); // 10==5 false
        System.out.println(a != b); // true
        System.out.println(a > b); // true
        System.out.println(a < b); // false
        // >= greater than and equal to
        // <= less than ....

        // logical (&& || !) logical and(t && t)= t ,or(t || f)=t ,not(t)=f
        System.out.println((5 > 2) && (5 < 1));
        System.out.println((5 > 2) || (5 < 1));
        System.out.println(!(5 == 5));

        // assigment (= += -= /= %=)
        // b = b + 10;
        b += 10;
        // a=a-5
        // a -= 5;
        a /= 10;
        System.out.println("A is  :" + a);
        System.out.println("B is  :" + b);

    }
}
