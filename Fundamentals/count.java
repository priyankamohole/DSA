import java.util.*;

public class count{

    public static void counting(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the total number want to enter :");
        int n = sc.nextInt();
        int p=0 ,ne=0 ,z=0;
        int num[] = new int[n];

        for(int i =0; i<n;i++){
            System.out.print("Enter number :");
            num[i]=sc.nextInt();    
        }
        
        for(int i= 0; i<n;i++){
            if(num[i]>0){
                p++;
            }else if(num[i]<0){
                ne++;
            }else{
                z++;
            }
        }
        System.out.println("Positive numbers : "+p);
        System.out.println("Negative numbers : "+ne);
        System.out.println("Zeros : "+z);

    }

    public static void main(String args[]){
        // Scanner sc =new Scanner(System.in);
        
        counting();
    }
}