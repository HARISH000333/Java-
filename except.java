

public class except {
    public static void calculate(int num[]){
        int n=num.length;
        
        
        for(int i=0;i<n;i++){
            int mul=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    mul=mul * num[j];
                    
                }
            

              
               
            }
             System.out.print(mul+" ");
            
            
           
        
            
             
             
        }
        
       
    }
    public static void main(String args[]){
        int num[]={10,20,30,40,50};
        calculate(num);
    }
    
}
