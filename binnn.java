public class binnn {
    public static int calculate(int num[], int target ){
        int n=num.length;
        int first=0;
        int last=n-1;
        while(first<=last){
            int mid=(first+last)/2;
            if(num[mid]==target){
                return mid; 
            }
            else if(num[mid]<target){
                 first=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int num[]={10,20,30,40,50};
        int target=20;
        System.out.print(calculate(num,target));
    }
    
}
