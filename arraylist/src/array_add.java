import java.util.*;

public class array_add {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = in.nextInt();
        }
        int n = in.nextInt();
        int[] brr = new int[n];
        for (int i = 0; i < n; i++) {
            brr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        if (m > n) {
            int A[] =new int[m];
            for (int i = 0; i < m; i++) {
                 A [i] = arr[i] + brr[i];
            }
            for (int i = 0; i <n; i++) {
                System.out.println(A[i]);
            }
        } else {
            int B [] =new int[m];
            for (int i = 0; i < m; i++) {
                B [i] = arr[i] + brr[i];
            }
            for (int i = 0; i <n; i++) {
                System.out.println(B[i]);
            }
        }

    }
    }


