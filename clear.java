public class clear {
    public static int calculateClear(int n,int i){
        int mask=~(1<<i);
       return (n&mask);
    }
    public static void main(String args[]){
        int n=6;
        System.out.print(calculateClear(n,1));
    }
    
}