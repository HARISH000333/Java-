public class goo {
    public static boolean calculate(int num[][],int key){
        int row=num.length-1;int column=0;
        while(column<num[0].length&&row>=0){
            if(num[row][column]==key){
                System.out.println("found at " + row + "," + column);
                return true;
            }
            else if(key>num[row][column]){
                column++;
            }else{
                row--;
            }


        }
        System.out.print("not found");
        return false;

    }
    public static void main(String args[]){
        int num[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=33;
        calculate(num,key);
    }
    
}
