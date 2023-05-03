import java.util.Scanner;

public class string_frequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str =in.next();
        int []ans=freq(str);
        for (int i = 0; i < ans.length ; i++) {
            System.out.print(ans[i]+" ");
        }
        // to find max
        for (int i = 0; i < ans.length ; i++) {
              int max = ans[0];
              if(ans[i]>max){
                max =ans[i];}
            char d = (char)(max+95);
            System.out.println(d);

    }        }
    public static int[] freq(String str) {
        int [] freq =new int[26];
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i) ;
            freq[ch-'a']=freq[ch-'a'] +1;
        }
        return freq;
    }
}
