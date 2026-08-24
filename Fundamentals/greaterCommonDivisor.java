// 12 = 1,2,3,4,6,12
// 18=1,2,3,6,9,18

import java.util.*;

public class greaterCommonDivisor{

    public static int gcd(int a , int b){

        int gcd =  1;
        for(int i=1;i<=a && i<=b ; i++){
            if(a%i == 0 && b%i == 0){
                gcd=i;
            }
        }

        return gcd;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int n1= sc.nextInt();
        System.out.print("Enter the second number :");
        int n2 = sc.nextInt();

        System.out.println("The GCD of " + n1 + " and " + n2 + " is: " + gcd(n1, n2));
    }
}