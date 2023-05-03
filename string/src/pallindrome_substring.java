import java.util.Scanner;

public class pallindrome_substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String st = in.next();

        int i=1;
        int count =st.length();
         while(i<st.length()) {

            char x= st.charAt(0);
             for (int j = 1; j < st.length(); j++) {
            if(x==st.charAt(j)) {
                count--;
            }
             }
             x=st.charAt(i);
            i++;
        }
        System.out.println(count);
    }
}
