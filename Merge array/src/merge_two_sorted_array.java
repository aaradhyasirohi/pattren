public class merge_two_sorted_array {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,9,9};
        int brr[]={2,5,6,7,9};
        int []ans=merge(arr,brr);
        for (int i = 0; i <ans.length ; i++) {
            System.out.println(ans[i]);
        }
    }
    public static int[] merge(int[]arr,int[]brr){
        int n= arr.length;
        int m=brr.length;
       int []ans=new int[m+n];
       int i=0;
       int j=0;
       int k=0;
       while (i<n &&j<m){
           if(arr[i]<brr[j]){
               ans[k]=arr[i];
               i++;
               k++;
           }
           else{
               ans[k]=brr[j];
               j++;
               k++;
           }

       }
      while(i<n){
          ans[k]=arr[i];
          k++; 
          i++;
      }
        while(j<m){
            ans[k]=brr[j];
            k++;
            j++;
        }
        return ans;
    }

}
