public class buy {
    public static int calculate(int buy[]){
        int n=buy.length;
         
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<n;i++){
            if(min<buy[i]){
                int profit=buy[i]-min;
                max=Math.max(max,profit);
               
                
            }else{
                min=buy[i];
            }
            
           


        }
       return max;
       


    }
    


    public static void main(String args[]){
        int buy[]={7,1,5,3,6,4};
        System.out.print(calculate(buy));
    }
    
}
