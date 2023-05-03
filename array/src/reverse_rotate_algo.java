import java.util.Scanner;

public class  reverse_rotate_algo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int i = 0;
        int j = arr.length - 1;
        int k = in.nextInt();
        rotateArray(arr,k);
        for (int l = 0; l <j ; l++) {
            System.out.println(arr[l]+" ");
        }

    }
    public static void rotateArray ( int[] arr, int k) {
        k = k % arr.length;
        int n = arr.length;
        reverse(arr, 0, n - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }
    private static void rotateArray() {
    }

    public static void reverse(int[] arr, int i, int j) {

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;


        }
    }
}
