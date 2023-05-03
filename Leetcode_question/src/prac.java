import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class prac {
    public static void main(String[] args) {
        int nums[]={0,1,2,2,3,0,4,2};
        int val=3;
        System.out.println(a(nums,val));
    }
      
//        String str = "fuckedup" ;
//        String str2 = "" ;
//        boolean a=true;
//        for (int i = 0; i <str.length(); i++) {
//                   char b=str.charAt(i);
//            for (int j = i+1; j <str.length(); j++) {
//                if(str.charAt(i)==str.charAt(j)){
//                     a=false;
//                     break;
//                }
//            }
//            if(a==true) str2=str2+b;
//            a=true;
//        }
//        System.out.println(str2);
//        HashSet<Character> set=new HashSet<>();
//        for (int i = 0; i < str.length(); i++) {
//               set.add(str.charAt(i));
//        }
//      Iterator<Character> it=set.iterator();
//       while (it.hasNext()){
//           System.out.print(it.next());
//       }
        public static int a(int nums[],int val){


        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;      }


       
    }