public class com {
    public static String calculate(String name){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<name.length();i++){
            int count=1;
            while(i<name.length()-1 &&name.charAt(i)== name.charAt(i+1)){
                count++;
                i++;

            }
            sb.append(name.charAt(i));
            if(count>1){
                sb.append(count);
            }
           
            


        }
         return sb.toString();



    }
    public static void main(String args[]){
        String name="aaabbbbccccc";
        System.out.print(calculate(name));
    }
    
}
