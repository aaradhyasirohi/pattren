import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class myques
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->=0){
            int n=in.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n ;i++ ){
                arr[i]=in.nextInt();
            }
            boolean a=true;
            int count=1;
            int b=0;
            Arrays.sort(arr);
            for (int i=0;i<n-1;i++ ){

                if(arr[i]==arr[i+1])count++;
                else if(arr[i]!=arr[i+1]){
                    if(count==arr[i]){
                        a=true;

                    }
                    else if(count!=arr[i]){
                        a=false;
                        
                    }

                    count=1;
                }
                b =arr[i+1];
            }

            if(a==true && count==b)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
