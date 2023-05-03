public class quick_sort_code {
    public static void main(String[] args) {
        int []arr={1,4,5,7,8,9,3};
        quicksort(arr,0,arr.length-1);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void quicksort(int arr[],int si,int ei){
        if(si>ei){
            return;
        }
       int pi=partition(arr,si,ei);
       quicksort(arr,si,pi-1);
       quicksort(arr,pi+1,ei);
    }
    public static int partition(int[]arr,int si,int ei){
        int pivote=arr[ei];
        int pi=si;
        for (int i = si; i < ei; i++) {
            if(arr[i]<=pivote){
                int temp=arr[i];
                arr[i]=arr[pi];
                arr[pi]=temp;
                pi++;
            }
        }
        int temp=arr[ei];
        arr[ei]=arr[pi];
        arr[pi]=temp;
        return pi;
    }
}


