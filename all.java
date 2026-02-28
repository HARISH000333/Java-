public class all {
    public static int get(int num,int i){
        int bitmask=1<<i;
        if((num&bitmask)==0){
            return 0;
        }
        return 1;
    }
    public static int set(int num,int i){
        int bitmask=1<<i;
        return num|bitmask;
    }
    public static int clear(int num,int i){
        int bitmask= ~(1<<i);
           return num&bitmask;
    }
    public static int update(int num,int i,int newbit){
        if(newbit==0){
           return clear(num,i);

        }
        return set(num,i);

    }
    public static int updates(int num,int i,int newbit){
        num=clear(num,i);
        int bitmask=newbit<<i;
        return num|bitmask;
    }
    public static int last(int num,int i){
        int bitmask=(~0)<<i;
        return num&bitmask;
    }
    public static int lastclear(int num,int i,int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
        return num&bitmask;
    }
    public static void calculatepower(int num){
        if ((num&(num-1))==0){
            System.out.print("power");
        }else{
            System.out.print("not a power");
        }
    }
    public static int calcul(int num){
        int count=0;
        while(num>0){
            if((num&1)!=0){
                count++;

            }
            num=num>>1;

        }
        return count;
    }
    public static int fast(int num,int power,int m){
        int ans=1;
        while(power>0){
            if((power&1)!=0){
                ans=(ans*num)%m;
            }
            num=(num*num)%m;
            power=(power>>1);
        }
        return ans;

    }
    

    public static void main(String args[]){
        System.out.println(fast(3,2,4));
        int fast=(int)Math.pow(5,3);
        System.out.print(fast);

    }
    
}
