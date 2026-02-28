
import java.util.*;

public class dowhile {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int evennumbers=0;
        int oddnumbers=0;
        int correct;
        do { 
            System.out.println("enter the number");
            int n = sc.nextInt();
            if(n%2==0){
                evennumbers+=n;

            }
            else{
                oddnumbers+=n;
        
            }
            System.out.println("enter the choice 1 to continue");
            correct=sc.nextInt();
            
        } while (correct==1);
        System.out.println("sum of even number i.e " + evennumbers);
        System.out.println("sum of odd number i.e " + oddnumbers);




    }
    
}
