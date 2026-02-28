import java.util.*;
public class Brute {
    // public static int calculate(ArrayList<Integer> list){

    //     int max=0;

    //     for(int i=0;i<list.size();i++){
    //         for(int j=i+1;j<list.size();j++){

    //             int height=Math.min(list.get(i),list.get(j));
    //             int width=j-i;
    //             int total=height*width;

    //             max=Math.max(max,total);


    //         }
    //     }
    //     return max;

    // }
    public static int calculate(ArrayList<Integer> list){
        int max=0;
        int lp=0;
        int rp=list.size()-1;

        while(lp<rp){

            int height=Math.min(list.get(lp),list.get(rp));
            int width=rp-lp;
            int totals = height*width;
            max=Math.max(max,totals);



            if(list.get(lp)<list.get(rp)){
                lp++;

            }else{
                rp--;
            }


        }
        return max;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
         list.add(8);
          list.add(6);
           list.add(2);
            list.add(5); 
             list.add(4);
              list.add(8);
               list.add(3);
                list.add(7);
                System.out.println(calculate(list));
        
    }
    
}
