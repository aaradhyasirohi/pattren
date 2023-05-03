import java.util.Scanner;

public class string_pallindrome {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        String str = in.next();
        boolean A =string(str);
        System.out.println(A);


    }

    public static boolean string(String str) {
        String ans = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            ans = ans + str.charAt(i);
        }
        boolean re = false;
        if (str.equalsIgnoreCase(ans)) {
            re = true;
        }
        return re;
    }
}

