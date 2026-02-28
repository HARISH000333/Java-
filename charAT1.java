public class charAT1 {
    public static void calculateCharAt(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        String first="mitchell";
        String second="harish";
        String full=first+" "+second;
        System.out.println(full.charAt(8));
        calculateCharAt(full);

    
    }
    
}
