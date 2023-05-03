import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i]=in.nextInt();  }
        int item =in.nextInt();

        int ans= search( arr,item);
        System.out.print(ans);


    }
    public static int search(int[]arr,int item) {
        int A = item;
        for (int i = 0; i < arr.length; i++) {
          if(arr[i]==item) {
              return i;
          }
        }
            return -1;
    }  
    

}
