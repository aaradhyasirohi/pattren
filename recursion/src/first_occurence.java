public class first_occurence {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,6,8};
        int element=9;
        System.out.println(found(arr,0,element));
    }
    public static int found(int []arr,int i,int element){
        if(i== arr.length){
            return -1;
        }
        if(arr[i]==element){
            return i;
        }
       return found(arr,i+1,element);
    }
}
