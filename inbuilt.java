import java.util.*;
public class inbuilt {
    public static void calculateInbMit(Integer num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }

    }
    public static void main(String args[]){
        Integer num[]={1,1,3,1,3,5,7};
        Arrays.sort(num,Collections.reverseOrder());
        calculateInbMit(num);
        

    }
   
    
}
 