import java.util.*;

public class freq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            String str="";
            int n=in.nextInt();
            for (int i=0;i<n ;i++ ){
                String str1=in.next();
                str=str+str1;
            }
            int arr[]=new int[8];
            for (int i=0;i<str.length() ;i++ ){
                if(str.charAt(i)=='c')arr[0]++;
                if(str.charAt(i)=='o')arr[1]++;
                if(str.charAt(i)=='d')arr[2]++;
                if(str.charAt(i)=='e')arr[3]++;
                if(str.charAt(i)=='h')arr[5]++;
                if(str.charAt(i)=='f')arr[7]++;
            }
            if(arr[0]%2==0){
                int temp=arr[0];
                arr[0]=arr[0]/2;
                arr[4]=temp/2;
            }
            else{
                int temp=arr[0];
                arr[0]=arr[0]/2;
                arr[4]=(temp/2)+1;
            }
            if(arr[3]%2==0){
                int temp=arr[3];
                arr[3]=arr[3]/2;
                arr[6]=temp/2;
            }
            else{
                int temp=arr[0];
                arr[3]=arr[3]/2;
                arr[6]=(temp/2)+1;
            }
            Arrays.sort(arr);
            System.out.println(arr[0]);
        }
    }
}
