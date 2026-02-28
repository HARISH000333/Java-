public class diagonalsum {
    public static int calculate(int num[][]){
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum+=num[i][i];
            if(i!=num.length-1-i){
                 sum+=num[i][num.length-1-i];

            }
           

           
              

                }
                return sum;
            }
        
    public static void main(String args[]){
        int num[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.print(calculate(num));
    }
    
}
