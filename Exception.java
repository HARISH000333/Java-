public class Exception {
    public static void main(String args[]){
        try{
            int num[]={1,2,3};
            System.out.print(num[10]+" ");



        } 
        catch (Exception e){
            System.out.print("something went wrong");


        }finally{
            System.out.print("yes");
        }
       

    }
    
}
