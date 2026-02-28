public class ith {
    public static int calculateI(int n,int i){
        int mask = 1 << i;
        
        if((n & mask) ==0){
            return 0;

        }
        else{
            return 1;
        }
    }

    public static void main(String args[]){
        int n=15;
        System.out.print(calculateI(n,5));


    }
    
}
