import java.util.Scanner;

public class inverse_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        int brr[]=new int [n];
        for (int i = 0; i < n; i++) {
           arr[i]=in.nextInt();
        }
        reverse(arr,brr);
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] +" ");
        }
    }
    public static void reverse(int [] arr,int []brr){
        for (int i = 0; i < arr.length ; i++) {

           brr[arr[i]]=i;
        }
    }
}
