import java.util.HashMap;

public class frequency {
    public static void main(String[] args) {
        String str="khushiiiikhushi";
        HashMap<Character,Integer> map=new HashMap<>(); // using hashmap to store unique character with its frequency
        for (int i = 0; i < str.length(); i++) {
            int c=0;
            for (int j = i; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                   c++;}
            }
            if(!(map.containsKey(str.charAt(i)))){
                 map.put(str.charAt(i), c);
            }
        }
        System.out.println(map);
    }
}
