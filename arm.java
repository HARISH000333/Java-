public class arm {
    public static void main(String args[]){
        int n =153;
        int real =n;
        int sum=0;
        while(n!=0){
            int digit =n%10;
             sum += (digit * digit * digit);

            n=n/10;
            

        }
        if(sum==real){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
    
}
