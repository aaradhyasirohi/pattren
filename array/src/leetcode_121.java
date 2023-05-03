public class leetcode_121 {
    public static void main(String[] args) {
        int arr[]={1,5,69,3,9,0};
        System.out.println( maxProfit(arr));
    }
    public static int maxProfit(int[] arr) {
        int l=arr.length;
        int i=0;
        int j=l-1;
        int min=0;
        while(i<j){
            int ans=0;
            if(arr[i]<arr[j]) ans=arr[j]-arr[i];
            if(arr[j]<arr[i])j--;
            else if(arr[i]<arr[j])i++;
            if(ans>min)min=ans;

        }
        return min;
    }
}
