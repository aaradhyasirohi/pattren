import java.util.Scanner;

public class jagged_array {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int[][] arr=new int[n][];
        for (int i = 0; i < arr.length; i++) {
            int c=in.nextInt();
            arr[i]=new int[c];
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]=in.nextInt();
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}

