import java.util.*;



public class averageOfThreeNumbers{

    public static int avg(int x, int y, int z ){
    int result = (x+y+z)/3;
    return result;
}

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st no :");
    int a = sc.nextInt();
    System.out.print("Enter 2nd no :");
    int b = sc.nextInt();
    System.out.print("Enter 3rd no :");
    int c = sc.nextInt();
    sc.close();

    System.out.println("The average is : "+avg(a,b,c));
    }
}