public class array_sort {
    public static void main(String[] args) {
        int[]arr={1,7,6,9};
     System.out.println(sorted(arr,0));

    }

    static boolean sorted(int []arr,int index){
        // base condition
        if(index== arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
}
