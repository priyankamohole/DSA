import java.util.*;

public class sumOfOddNumbers{

        public static int sumOfOddNo(int n){
        int sum = 0;
        for(int i = 1; i<=n; i+=2){
            sum +=i;  
        }
        System.out.print("The sum of odd number is : "+sum);
        return 0;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        sc.close();
        
        sumOfOddNo(num);
    }
}