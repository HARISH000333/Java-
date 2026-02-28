public class Hybrid {
    public static void main(String args[]){
        Peacock p1= new Peacock();
        p1.breathe();
        p1.fly();
        Humans h1=new Humans();
        h1.breathe();
        h1.speak();

    }
    
}
class Animals{
    void breathe(){
        System.out.println("it can breathe");
    }
}
class Mammals extends Animals{
    void walk(){
        System.out.println("it can walk");
    }

}
class Birds extends Animals{
    void fly(){
        System.out.println("it can fly");
    }
}
class Humans extends Mammals{
    void speak(){
        System.out.println("it can speak");
    }
}
class Peacock extends Birds{
    void rare(){
        System.out.println("it is rare to find");
    }
}
