import java.util.Scanner;

public class string_ques {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
           String str =in.next();
           printString(str);
           
    }
    public static void printString(String str){
         String ans ="";
          ans = ans +str.charAt(0);
        for (int i = 1; i <str.length() ; i++) {
             char ch = str.charAt(i);
             if(ch>='A' && ch<='Z'){
                 System.out.println(ans);
                 ans="";
                 ans =ans +ch;
             }
             else{
                 ans =ans+ch;
             }
        }
        System.out.println(ans);
    }
}
