public class Aborn {
    public static void all(String str,int idx, StringBuilder news, boolean map[]){
        if(idx==str.length()){
            System.out.print(news);
            return;
        }
        char curr=str.charAt(idx);
        if(map[curr-'a']==true){
            all(str,idx+1,news,map);
        }else{
            map[curr-'a']=true;
            all(str,idx+1,news.append(curr),map);


        }



    }
    



    public static void main(String args[]){
        String str="appnnacollege";
        all(str,0,new StringBuilder(""),new boolean[26]);

    }
    
}
