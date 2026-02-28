public class Back {
    public static void calculate(int arr[],int i,int value){
        //base case 
        if(i==arr.length){
            print(arr);
            return;
        }



        //recurive case

        arr[i]=value;

        calculate(arr,i+1,value+1);
        arr[i]=arr[i]-2;



    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]=new int[5];

        calculate(arr,0,1);

        print(arr);
    }
    
}
