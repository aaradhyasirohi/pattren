public class element_at_rightplace {
    public static void main(String[] args) {
        int [] arr= {15,13,5,6,7,8,9};
         int a = partition(arr,0,arr.length-1);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        System.out.println(a);
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
