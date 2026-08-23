import java.util.*;

public class power{

    public static int powerOfNumber(int a, int b){
        int p = 1;
        for(int i=1;i<=b;i++){
            p *=a;
            if(a==0){
                p=1;
            }
        }
        System.out.println("Power of number is :"+p);
        return 0;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n= sc.nextInt();
        System.out.print("Enter the power :");
        int x= sc.nextInt();

        powerOfNumber(n,x);

    }
}