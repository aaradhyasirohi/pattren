import java.util.Scanner;

public class matrix_zero {
    public static void matrix(int i,int j,int arr[][]){
        for (int k = 0; k < arr.length; k++) {
            arr[i][k]=-1;

        }
        for (int k = 0; k < arr[i].length; k++) {
            arr[k][j]=-1;

        }
    }
    public static void matrix1(int arr[][], int n,int m){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
               if(arr[i][j]==0){
                   matrix(i,j,arr);
               }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[][] arr =new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
               arr[i][j]=in.nextInt();
            }
        }

        matrix1(arr,n,m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
