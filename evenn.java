public class evenn {
    public static void calculate(int n){
        if((n&1)==0){
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }
    public static void main(String args[]){
        calculate(50);
        calculate(49);
       
        
    }
    
}
