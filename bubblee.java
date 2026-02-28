public class bubblee {
    public static void calculateSort(int num[]){
        for(int i=0;i<num.length-1;i++){
            boolean swap=false;
            for(int j=0;j<num.length-1-i;j++){
                if(num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
    public static void write(int num[]){
        for(int k=0;k<num.length;k++){
            System.out.print(num[k]+" ");
        }
    }
    

    public static void main(String args[]){
        int num[]={1,2,3,4,5};
        calculateSort(num);
        write(num);

    }
    
}
