class diagonal{
    public static int calculateDia(int diagonal[][]){
        int sum=0;
        for(int i=0;i<diagonal.length;i++){
            sum+=diagonal[i][i];
            if(i!=diagonal.length-1-i){
                sum+=diagonal[i][diagonal.length-1-i];

            }

          
        }
        return sum;
    }
    public static void main(String args[]){
        int diagonal[][]={{0,1,2},{3,4,5},{6,7,8}};
        System.out.print(calculateDia(diagonal));
    }
    
}
