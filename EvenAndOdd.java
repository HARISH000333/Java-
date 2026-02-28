
import java.util.*;

public class EvenAndOdd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num;
        int even=0;
        int odd=0;
        int choice;
        do {
            System.out.println("enter a number: ");
            num=sc.nextInt();
            if(num%2==0){
                even++;
            }
            else{
                odd++;
            }
            System.out.println("Do you want to continue? (1 for Yes / 0 for No): ");
            choice=sc.nextInt();

            
        } while (choice==1);
        System.out.println("Total Even numbers: " + even);
        System.out.println("Total Odd numbers: " + odd);
    }

    
}
