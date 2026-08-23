import java.util.*;

public class eligiableToVoteCheck{

    public static void eligiablityCheck(int a){
        if(a>=18){
            System.out.print("Person eligiable to vote.");
        }
        else{
            System.out.print("Person is not eligiable to vote.");
        }
    }
    

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age to check eligiable to vote or not :");
        int age=sc.nextInt();

        eligiablityCheck(age);
    }
}