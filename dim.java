public class dim {
    public static float calculate(String path){
        int n=path.length();
        int x=0,y=0;
        for(int i=0;i<n;i++){
            if(path.charAt(i)=='w'){
                x--;

            }
            else if(path.charAt(i)=='e'){
                x++;
            }
            else if(path.charAt(i)=='n'){
                y++;
            }
            else{
                y--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);

    }
    public static void main(String args[]){
        String path="wnsewwwes";
        System.out.print(calculate(path));
    }
    
}
