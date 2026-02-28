public class arrays1 {
    public static int calculate1(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return 0;
    }
    

    public static int calculate2(String menu[],String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==key){
                return i;
            }
        }
        return 0;
    }




    public static void main(String args[]){
        String menu[]={"dosa","idli","puri","sambar"};
        String key="puri";
        int index = calculate2(menu,key);
        if(index==0){
            System.out.print("not found");
        }else{
            System.out.print("found at " + index);
        }

    }
    
}
