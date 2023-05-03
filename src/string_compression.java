import java.util.Scanner;

public class string_compression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str =in.next();
        string(str);

        
    }
    public static void string(String str){
        char initial=str.charAt(0);
        int count=1;
        String ans="";
        for (int i = 1; i < str.length(); i++) {
            char ch =str.charAt(i);
            if(initial==ch) {
                count++;
            }
            else{
             ans =ans+initial+count;
             initial= ch;
             count=1;
            }
        }
      ans =    ans +str.charAt(str.length()-1)+count;
        System.out.println(ans);
    }
}
