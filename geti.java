public class geti {
    public static int calculate(int num,int i){
        int bitmask= ~(1<<i);
        return num&bitmask;
        
    }
    public static int calculate1(int num,int i){
        int bitmask=1<<i;
        return num|bitmask;
        
            
        }
        
    
    public static void main(String args[]){
        System.out.print(calculate(10,1));

    }
    
}
