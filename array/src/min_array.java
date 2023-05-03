import java.util.Scanner;

public class min_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i]=in.nextInt();  }

        int ans= minimun( arr);
        System.out.print(ans);


    }

    public static int minimun( int arr[]) {
        int min=arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i]<min) {
                min=arr[i];
            }
        }
        return min;
    }


}

