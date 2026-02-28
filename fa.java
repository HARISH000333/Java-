public class fa {
    public static int calculatefact(int n){
       
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
            
        }
        return fact;
       

        
    }
    public static int calculater(int n,int r){
       int factn=calculatefact(n);
       int factr=calculatefact(r);
       int factnminusr=calculatefact(n-r);
       int factorial = factn/(factr*factnminusr);
       return factorial;



    }
    public static void main(String args[]){
        System.out.print(calculater(5,2));
        
        
       
    }
    
}
