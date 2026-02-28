public class Fri {
    public static int calculate(int n){
        if(n==1||n==2){
            return n;

        }
        int one=calculate(n-1);
        int pair=calculate(n-2)*(n-1);
        int ways=one+ pair;
        return ways;

    }
    public static void main(String args[]){
        System.out.print(calculate(3));

    }
    
}
