import java.util.*;

public class missing_number {
    static int missing_num(int arr[],int n){
       

        boolean a=false;
        for (int i = 1; i <n+1 ; i++) {

            for (int k = 0; k < n; k++) {
              if(arr[k]!=i){
                  a=true;
               }
              else{ a=false;
              break;   }

              }
            if(a==true) {
               return i;
            }
        }
        return -1;
       
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println(missing_num(arr,n));
    }
}
