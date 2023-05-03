public class array_prob {
    public static void main(String[] args) {
        int arr[]={2,2,3,3,6,6,7};
        System.out.println(ans(arr));
    }
    public static int ans(int arr[]){
       int unique=0;
        for (int n:arr) {
           unique^=n;
        }
        return unique;
    }
}
