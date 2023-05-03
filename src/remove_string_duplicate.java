import java.util.Scanner;

public class remove_string_duplicate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
         test(str);

    }
    public static void test(String str) {
        char pre = str.charAt(0);
        String st ="";
        String ans = st+pre;

        for (int i = 1; i <str.length() ; i++) {
            if(str.charAt(i)==pre)
            {  st =""; }
            else{
                pre=str.charAt(i);
            }
        }
        System.out.println(st);
    }
}
