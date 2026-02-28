public class Consecutive {
    public static void calculate(int n,int last,String str){

        if(n==0){
            System.out.println(str);
            return;

        }
        calculate(n-1,1,str+"1");
        if(last==1){
            
             calculate(n-1,0,str+"0");
            


        }
    }
    public static void main(String args[]){
        calculate(3,1,"");

    }
    
}
