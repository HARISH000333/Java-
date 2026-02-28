public class Abstract {
    public static void main(String args[]){
        

        Horse h1=new Horse();
        System.out.println(h1.color);//output : brown because it calls parent class first
        Bread b1=new Bread();
        
     }
    
}
abstract class Animal{
    String color;
    Animal(){
        color="brown";
        System.out.println("animal is called");

    }
    abstract void walk();//it will be subclass of function and not animal class and this gives idea but not implementation to the animal class


}
class Horse extends Animal{
     Horse(){
            System.out.println("horse is called");

        }
    void changeColor(){
        color="blue";
       
        
    }
    void walk(){
        System.out.println("walks on four legs");
    }

}
class Bread extends Horse{
    Bread(){
        System.out.println("bread is called");
    }

}
