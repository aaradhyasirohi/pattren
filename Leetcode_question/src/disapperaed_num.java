import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//public class disapperaed_num {
    //        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//            String str= "khushi sirohi";
//            String str2="";
//            for (int i = 0; i < str.length(); i++) {
//                  str2=str2+str.charAt(i);
//                if(str.charAt(i)==' '){
//                    System.out.println(str2);
//                    break;
//                }
//
//            };
//            int arr[]={1,4,0};
//
//
//
//
//        }
//        public List<Integer> missingNumber(int[] nums) {
//            int i=0;
//            while(i<nums.length){
//                int correct =nums[i]-1;
//
//                if( nums[i]<nums.length && nums[correct]!=nums[i] ){
//                    int temp =nums[i];
//                    nums[i]=nums[correct];
//                    nums[correct]=temp;
//                }
//                else{
//                    i++;
//                }
//            }
//            List<Integer> ans= new ArrayList<>();
//            for (int j = 0; j < nums.length; j++) {
//                if(nums[j]!=j+1){
//                    ans.add(j+1);
//                }
//            }
//            return ans;
//        }
//
//    }
//
//
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class disapperaed_num
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner in =new Scanner(System.in);

        int n=in.nextInt();
        int m=in.nextInt();
        String str[]=new String[n];
        for (int i=0;i<n ;i++ ){
            str[i]=in.next();
        }
        boolean a=false;
        for (int j=0;j<m;j++ ){
            String str2=in.next();
            if(str2.length()>=47){
                System.out.println("YES");
                a=true;
            }
            else
            {
                for (int i=0; i<n;i++ ){
                    if(str2.contains(str[i])){
                        System.out.println("YES");
                        a=true;
                        break;
                    }
                }}
            if(a==false)System.out.println("NO");
            str2=" ";
             a=false;
        }

    }
}