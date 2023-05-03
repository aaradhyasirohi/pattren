import java.util.Scanner;

public class reverse_array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        int m=in.nextInt();

        for(int i=1;i<arr.length;i++ ){
            if((m+i)<arr.length-i){
                int temp=arr[m+i];
                arr[m+i]=arr[arr.length-i];
                arr[arr.length-i]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


