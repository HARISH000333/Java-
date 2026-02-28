public class Interface {
    public static void main(String arg[]){
        Deer d1=new Deer();
        d1.eat();

    }
    
}
interface Animal{
    void eat();

}
class Lion implements Animal{
    public void eat(){
    System.out.print("eat other animal");
    }

}
class Deer implements Animal{
    public void eat(){
        System.out.print("eat grass");
    }
}
