import java.util.Scanner;

public class search_in_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int arr[][]= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
            }
        }
        int x=in.nextInt();
        int t= ret(arr,x);
        System.out.println(t);

    }
    public static int ret(int arr[][],int x){
        int row=0;
        int col=arr.length-1;
        while (col>=0 && row< arr.length){
            if(arr[row][col]==x){
                return 1;
            } else if (arr[row][col]<x) {
                row++;
            }
            else{
                col--;
            }
        }
        return 0;
    }
}
