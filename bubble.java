public class bubble {
    public static void bubbleSort(int num[]){
        int n=num.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        for(int k=0;k<n;k++){
            System.out.print(num[k]+ " ");
        }

    }
    public static void main(String args[]){
        int num[]={2,4,6,8,1};
        bubbleSort(num);
      

        
    }
    
}
