
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int n=t;
        String b="";
        String c="";
        while(t-->0){
            String a=in.next();
            if(t==n-1){
                b=a;
            }
            else{
                for (int i=0;i<b.length() ;i++ ){
                    for (int j=0;j<a.length() ;j++ ){
                        if(b.charAt(i)==a.charAt(j))
                        { c=c+b.charAt(i); break;}

                    }
                }
                b=c;
                c="";
            }

        }
       if(b.length()!=0)  System.out.println(b);
       else System.out.println("no such string");



    }}