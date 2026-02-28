public class Inherit {
    public static void main(String args[]){
        Teen mit =new Teen();
        mit.swim();
        mit.bite();
        mit.hunt();
        mit.legs=2;
        System.out.println(mit.legs);
        mit.eat="mitchell";
        System.out.print(mit.eat);
    }
    
}
class Animal{//parent class or base class
    String eat;
    void swim(){
        System.out.println("it can swim");
    }
}
class Lion extends Animal{//child class or derived class or subclass
    int roar;
    void bite(){
        System.out.println("it can bite");
    }
}
class Human extends Lion{
    void hunt(){
        System.out.println("humans hunt lion");
    }
}
class Teen extends Human{
    int legs;
}
