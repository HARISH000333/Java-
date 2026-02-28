
import java.util.*;

public class anagas {
    public static void main(String args[]){
        String name1="race";
        String name2="carw";
        name1=name1.toLowerCase();
        name2=name2.toLowerCase();
        
        if(name1.length()==name2.length()){
            char array1[]=name1.toCharArray();
            char array2[]=name2.toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            boolean result=Arrays.equals(array1,array2);
            if(result){
                System.out.print("yes");
            }else{
                System.out.print("no");
            }
        }else{
            System.out.print("no");
        }

    }
    
}
