import java.util.*;
public class fact {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int fact=1;
        System.out.println("enter the number");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            fact*=i;
            
        
        }
        System.out.print(fact);

    }
    
}
