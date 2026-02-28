public class Hierarchial {
    public static void main(String args[]){
        Mammals m1=new Mammals();
        m1.breathe();
        Birds b1=new Birds();
        b1.breathe();


        }

    }
    

class Animal{
    void breathe(){
        System.out.println("it will breathe");
    }
}
class Mammals extends Animal{
    void walk(){
        System.out.println("it will walk");
    }
}
class Birds extends Animal{
    void fly(){
        System.out.println("it will fly");
    }
}
