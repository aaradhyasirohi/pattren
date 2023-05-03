import java.util.Scanner;

public class leet_code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int i=0;
        int j=0;
        int count=0;
        for (int k = 0; k <n+i ; k++) {
              int a=(k+i)-j;
              int b=arr[i+k]-arr[j];

              if(a!=b){
                  count++;
              }
              i++;
              j++;
        }
        System.out.println(count);
    }
}