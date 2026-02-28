public class Himm {
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.calculateColor("blue");
        System.out.println(p1.color);
        p1.color="pink";
        System.out.println(p1.color);
        p1.calculateSize(10);


       
        p1.calculateSize(46);
        


    }
    
}
class Pen{
    protected String color;
    private int size;

     public void calculateColor(String newColor){
        color=newColor;
    }
    public void calculateSize(int newSize){
        size=newSize;
    }
}
