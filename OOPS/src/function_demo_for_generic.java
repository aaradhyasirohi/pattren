public class function_demo_for_generic {
    public static void main(String[] args) {
        Integer[]arr={1,4,5,6,7};
        display(arr);
        String[] arr1={"Ram","sham","khushi"};
        display(arr1);
    }
    public static <T> void display(T[]arr){
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

}
