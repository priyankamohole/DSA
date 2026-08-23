import java.util.*;

public class greaterNumber{

    public static int greaterNo(int a , int b){
        if (a>b){
            System.out.print("Number 1st is greater :"+a);
        }
        else{
            System.out.print("Number 2nd is greater :"+b);
        }
        return 0;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        int a= sc.nextInt();
        System.out.print("Enter 2nd number :");
        int b= sc.nextInt();

        greaterNo(a,b);
    }
}