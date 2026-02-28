import java.util.*;
public class Hap {
    public static void main(String args[]){
        HashMap<String,Integer> mm=new HashMap<>();
        mm.put("A", 1);
        mm.put("B", 2);
        mm.put("C", 3);
        mm.put("D", 4);
        // System.out.println(mm);

        // System.out.println(mm.get("C"));
        // System.out.println(mm.containsKey("E"));

        // mm.remove("B");
        // System.out.println(mm);


        // mm.clear();
        // System.out.println(mm.isEmpty());
        // System.out.println(mm);
        // System.out.println(mm.size());
        Set<String> keys=mm.keySet();
        for (String k : keys) {
            System.out.println("Key: "+k+" Value: "+mm.get(k));
            
        }





    }
    
}
