import java.util.*;

public class circumferenceOfCircle{

    public static float circumference(float r){
        // double pi=3.14;
        float c = (float)(3.14*r*r);
        System.out.print("The circumference of circle : "+c);
        return  0;
    }
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter radius :");
        int radius= sc.nextInt();
        circumference(radius);
    }
}