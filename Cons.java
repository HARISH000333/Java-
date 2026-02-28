public class Cons {
    public static void main(String args[]){
        Student addd;
        Student s1=new Student();
        s1.name="mit";
        System.out.println(s1.marks);  
        s1.roll[0]=100;
        s1.roll[1]=98;
        s1.roll[2]=98;
      


        Student s2=new Student(s1);//copy....
        s1.name="mitc";
        s1.roll[2]=100;
        
        
        s2.password=1234;
        System.out.println(s2.name);
        
        for(int i=0;i<3;i++){
            System.out.println(s2.roll[i]);
        }
    
        


    }
    
}
class Student{
    String name;
    int marks;
    int password;
    int roll[];
    Address add;
    class Address {
        String city;
    }

    //copy constructor
    Student(Student s1){
        roll=new int[3];
        
        this.name=s1.name;
        this.marks=s1.marks;
        this.roll=s1.roll;
    }
    Student(){
         roll=new int[3];
        
      
    
    }
    Student(String name){
         roll=new int[3];
      

        
}

}
