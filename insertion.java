public class insertion {
    public static void calculateIns(int num[]){
        for(int i=0;i<num.length;i++){
            int curr=num[i];
            int prev=i-1;
            while(prev>=0&&num[prev]>curr){
                num[prev+1]=num[prev];
                prev--;
            }
            num[prev+1] =curr;
        }
        for(int k=0;k<num.length;k++){
            System.out.print(num[k]+" ");
        }
    }
    public static void main(String args[]){
        int num[]={2,4,6,5,3,9,8};
        calculateIns(num);
    }
    
}
