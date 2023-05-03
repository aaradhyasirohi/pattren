import java.util.Scanner;

public class subanagra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int arr[]=new int[n];
            int min=Integer.MAX_VALUE;
            int ans=0;
            int sum=0;
            for (int i=0;i<n ;i++ ){
                int p=0;
                int s=0;
                for (int j=0;j<=i ;j++ ){
                    p=p+arr[j];
                }
                for (int k=n-1;k>=i ;k-- ){
                    s=s+arr[k];
                }
                sum=p+s;
                if(min>=sum)ans=i;
                min=Math.min(min,sum);
            }
            System.out.println(ans);
        }
    }
}
