
import java.util.*;
public class inttt {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int evennumber=0;
        int oddnumber=0;
        int choice;
    
        do{
            System.out.println("enter the number");
            int n = sc.nextInt();
            if(n%2==0){
                evennumber+=n;
                
            }else{
                oddnumber+=n;
            

            }
            System.out.println("enter 1 to continue");
            choice=sc.nextInt();





        }while(choice==1);
        System.out.println("sum of even nuber is" + evennumber);
        System.out.println(" sum of odd number is" +oddnumber);




    }
    
}
