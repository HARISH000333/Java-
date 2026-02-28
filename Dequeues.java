import java.util.*;
public class Dequeues {
    public static void main(String args[]){
        Deque<Integer> dq=new LinkedList<>();
        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(5);
        dq.addLast(25);
        dq.addFirst(1);
        
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        
    }
    
}
