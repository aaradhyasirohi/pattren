public class mergesort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 7, -1, 4};
        int[] a = merge(arr, 0, arr.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] merge(int[] arr, int st, int end) {
        if (st == end) {
            int[] bs = new int[1];
            bs[0] = arr[st];
            return bs;
        }
        int mid = (st + end) / 2;
        int fs[] = merge(arr, st, mid);
        int ss[] = merge(arr, mid + 1, end);
        return merge1(fs, ss);
    }
    public static int[] merge1(int[]arr,int[]brr){
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
