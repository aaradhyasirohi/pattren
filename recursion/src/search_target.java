import java.util.ArrayList;

public class search_target {

    public static void main(String[] args) {
        int arr[]={1,5,5,7,8,5};
        int target=5;
        System.out.println (search(arr,0,target));
        // searchall(arr,0,target);
        System.out.println(list);
        System.out.println(search_all(arr,0,target,list));
    }
    //to check whether target present in array or not
    static boolean search(int[] arr,int index, int target){
        if( index==arr.length){
            return false;
        }

            return arr[index]==target || search(arr,index+1,target);
    }
    // find all index
    static ArrayList<Integer> list= new ArrayList<>();
    static void searchall(int[] arr,int index, int target){
        if( index==arr.length){
            return ;
        }
        if(arr[index]==target) {
            list.add(index);
        }
             searchall(arr,index+1,target);
    }
    // using arraylist
    static ArrayList search_all(int[] arr,int index, int target,ArrayList<Integer> list) {
        if( index==arr.length){
            return list ;
        }
        if(arr[index]==target) {
            list.add(index);
        }
       return search_all(arr,index+1,target,list);
    }

}
