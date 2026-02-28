
import java.util.*;
public class isodd {
    public static boolean calculate(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(calculate(n));

    }
    
}
