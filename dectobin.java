public class dectobin {
    public static void calculate(int n){
       int mynum=n;

        int power=0;
        int binary=0;
      

        


        while(n>0){
            int last=n%2;
            binary=binary+(last*(int)Math.pow(10,power));
            power++;
            n=n/2;

        }
        System.out.print("binary of " + mynum + "is " + binary);


    }
    public static void main(String args[]){
        calculate(7);
        

    }
    
}
