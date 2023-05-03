import java.util.*;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        //inset only store unique element
        set.add(2); //list.add();
        set.add(8);
        set.add(9);
        set.add(2);
        // search -contains
        if(set.contains(2)){
            System.out.println("set contains 2");
        }
        set.remove(2);
        if(!set.contains(2)){
            System.out.println(" does not contains 2");
        }
            // size
        System.out.println(set.size());    // list.size()
        //print all element
        System.out.println(set);
        // iterator
        Iterator it= set.iterator();
        //hasnext ,next
        while (it.hasNext()){
            System.out.println(it.next());
        }
        
        
    }
}
