public class countt {
    public static void calculate(int num[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            largest=Math.max(largest,num[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<num.length;i++){
            count[num[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length-1;i++){
            while(count[i]>0){
                num[j]=i;
                j++;
                count[i]--;
            }
        }
    
        
    }
    public static void sort(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }




    public static void main(String args[]){
        int num[]={5,4,3,2,1,2,3,4,5,5};
        calculate(num);
        sort(num);
    }
    
}
