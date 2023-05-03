import java.util.Scanner;

public class matriz_zero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr[][]=new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
              arr[i][j]=in.nextInt();
            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
               if(arr[i][j]==0){
                   for (int k = 0; k <n ; k++) {
                     arr[k][j]=0;
                   }
                   for (int k = 0; k <m ; k++) {
                     arr[i][k]=0;
                   }
               }
            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.println(arr[i][j]);
            }
        }

    }
}
