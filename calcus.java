
import java.util.*;
public class calcus {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y= sc.nextInt();
        int numbers=sc.nextInt();

        switch(numbers){
            case 1: System.out.print("Addition" + (x+y));
            break;
            case 2: System.out.print("sub" + (x-y));
            break;
            case 3: System.out.print("mul" + (x*y));
            break;
            case 4: System.out.print("div" + (x/y));
            break;
            default: System.out.print("invalid");
           


        }
        

    }
    
}
