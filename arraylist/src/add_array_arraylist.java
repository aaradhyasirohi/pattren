import java.util.*;
import java.util.Scanner;

public class add_array_arraylist {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int m = in.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = in.nextInt();
            //list.add(in.nextInt)

        }
        int n = in.nextInt();
        int[] brr = new int[n];
        for (int i = 0; i < n; i++) {
            brr[i] = in.nextInt();
        }
        Addnumber(arr,brr);
    }
    public static void Addnumber(int[]arr,int[]brr){
        ArrayList<Integer> list=new ArrayList<>();
         int carry=0;
        int i=arr.length-1;
        int j= brr.length-1;
        while(i>=0||j>=0){
            int sum =0;
            if(i>=0){
                sum=sum+arr[i];
                i--;
            }
            if(j>=0){
                sum=sum+brr[j];
            }
            sum=sum+carry;
            list.add(sum%10);
            carry=sum/10;
        }
        if(carry>0){
            list.add(carry);
        }
        for (int k = list.size()-1; k >=0 ; k--) {
            System.out.print(list.get(k)+" ,");
        }
        System.out.print("END");

    }

}
