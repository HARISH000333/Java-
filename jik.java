public class jik {
    public static void main(String args[]){
        int first =0;
        int second = 1;
        int n =5;
        int third=first + second;
       
        for(int i =2;i<=n;i++){
            third = first + second;
          
            first = second;
            second= third;
            
    }
      System.out.print(" " + third);
   
           
           
        }
        
    
}