import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        int a[]=new int[n];
        for (int i = 0; i <n ; i++) {
           a[i]=in.nextInt();
        }
       int k=in.nextInt();
        for (int i = 0; i <k ; i++) {
         if(i<(k-1-i)) {
             a[i]=a[k-1-i];
        }   }

        for (int j = 0; j < n; j++) {
            System.out.println(a[j]);
        }
    }
}
