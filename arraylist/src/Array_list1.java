import java.util.ArrayList;


       
    public class Array_list1 {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            System.out.println(list);
            System.out.println(list.size());
            //add method
            list.add(10);
            list.add(20);
            System.out.println(list);
            // add at any index
            list.add(2,89);
            list.add(3,78);
            System.out.println(list);
            //remove
            System.out.println(list.remove(2));
            System.out.println(list);
            System.out.println(list.size());
            System.out.println(list.get(1));
        }
    }


