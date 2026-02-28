
import java.util.*;

public class insert {
    public static void calculate(int num[]){
        for(int i=1;i<num.length;i++){
            int second=num[i];
            int first=i-1;
            while(first>=0 && num[first] > second){
                num[first+1]=num[first];
                first--;

            }
            num[first+1]=second;


        }
    }
    public static void sort(Integer num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String args[]){
        
        Integer num[]={4,5,1,2,3};
        Arrays.sort(num, Collections.reverseOrder());
        sort(num);
         
       
    }
    
}
