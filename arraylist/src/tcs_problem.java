import java.util.Scanner;

public class tcs_problem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        int brr[]=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=in.nextInt() ;
        }

        for (int i = 0; i <n ; i++) {
          brr[i]=in.nextInt();
        }
        int element=0;
        int sum=0;
        for (int i = 0; i < n; i++) {
            element = element +arr[i] - brr[i];
            if (element >= sum) {
                sum = element;
            }
        }
        if(sum>element)
        System.out.println(sum);
        else if(sum==element) {
            System.out.println(sum);
        }
        else{
            System.out.println(element);
        }
    }
}
