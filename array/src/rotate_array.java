import java.util.Scanner;

public class rotate_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i]=in.nextInt();  }
        int k=in.nextInt();

        search( arr,k);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void search(int[]arr,int k) {
        k=k% arr.length;

        for (int m = 1; m <= k ; m++) {

            int temp=arr[arr.length-1]   ;

            for (int i = arr.length-2; i>=0; i--) {
                arr[i+1]=arr[i];
            }
            arr[0]=temp;
        }
    }
}

