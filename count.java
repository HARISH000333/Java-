public class count {
    public static void calculateCount(int num[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            largest=Math.max(largest,num[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<num.length;i++){
            count[num[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                num[j]=i;
                j++;
                count[i]--;
            }

        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
            }
    public static void main(String args[]){
        int num[]={2,2,1,4,5,7,9};
        calculateCount(num);

    }
    
}
