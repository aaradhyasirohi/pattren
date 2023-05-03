import java.util.ArrayList;
import java.util.Collections;

public class array_list2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //add method
        list.add(10);
        list.add(20);
        list.add(50);
        System.out.println(list);
        list.set(2,-19);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i)+" ");

        }
        //for each loop
        System.out.println( );
        for (int v:list){
            System.out.print(v+" ");
        }

    }
}
