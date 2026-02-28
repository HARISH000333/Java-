public class javas {
    public static void calculate(int num[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        int tp=0;
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(num[k]+ " ");
                   
                    sum+=num[k];
                    
                }
                 tp++;
                
                 
                  System.out.print("sum is " + sum);
                  System.out.println();
                  if(max<sum){
                    max=sum;
                  }

                  if(min>sum){
                    min=sum;
                  }
            }
           

        }
        System.out.println(tp);
        System.out.println("max is " + max);
        System.out.print("min is " + min);
       
       
    }
    public static void main(String args[]){
        int num[]={2,4,6,8,10};
        calculate(num);

    }
    
}
