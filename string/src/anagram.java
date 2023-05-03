import java.util.*;

public class anagram {
    public static void main(String[] args) {
     String s= "abc";
        String s1="dba";
        //  wrong
//        int a=0,b=0;
//       if(s.length()==s1.length()) for (int i = 0; i <s.length() ; i++) {
//             a=a+(s.charAt(i)-97);
//             b=b+(s1.charAt(i)-97);
//        }
//       if(a==b) System.out.println("yes");
//       else System.out.println("NO");

        boolean a=true;
       char b[]= s.toCharArray();
        char c[]=s1.toCharArray();
        Arrays.sort(b);
        Arrays.sort(c);
        for (int i = 0; i < b.length; i++) {
            if(b[i]!=c[i]){a=false;
            break;    }
        }
         if(!a) System.out.println("no");
         else System.out.println("yes");
    }
}
