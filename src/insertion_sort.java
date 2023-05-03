public class insertion_sort {
    public static void main(String[] args) {
        int []arr={1,6,7,8,4,5};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }

    }
    public static void sort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int j=i-1;
            int item =arr[i];
            while (j>=0 && arr[j]>item){
                arr[j+1]=arr[j];
                j--;
            }
            j++;
            arr[j]=item;
        }
    }
}
