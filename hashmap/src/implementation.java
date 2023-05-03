import java.util.HashMap;
import java.util.*;

public class implementation {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("india",100);
        map.put("pakistan",0);
        map.put("china",9);
        map.put("china",90) ;
        System.out.println(map);
//        if(map.containsKey("china")){
//            System.out.println("present");
//        }
       System.out.println(map.get("china"));  // get function
//        // iteration in hashmap
//        for (Map.Entry<String,Integer> e:map.entrySet()){
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
//        // only for key
//        Set <String > keys =map.keySet();
//        for (String key:keys) {
//            System.out.println(map.get(key));
//        }
//        // remove method
//        map.remove("china");
//        System.out.println(map);
    }
}
