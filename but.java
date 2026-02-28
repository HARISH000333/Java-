public class but {
    public static int calculateSet(int n,int i){
        int mask=1<<i;
        return n|mask;
    }
    public static int calculateClear(int n,int i){
        int mask=~(1<<i);
        return n&mask;
    }
    public static int update(int n,int i,int newBit){
        if(newBit==0){
            return calculateClear(n,i);
        }else{
            return calculateSet(n,i);
        }

    }
    public static int calculateUpdate1(int n,int i,int newBit){
        n=calculateClear(n,i);
        int mask=newBit<<i;
        return n|mask;

    }

    
   
    public static void main(String args[]){
        System.out.print(calculateUpdate1(10,2,1));

    }
    
}
