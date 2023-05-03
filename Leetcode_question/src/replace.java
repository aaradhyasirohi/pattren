import java.util.Scanner;

// replacement of characters in any string
public class replace {
          public static void main(String[] args) {
              Scanner in = new Scanner(System.in);
              int n = in.nextInt();
              int m = in.nextInt();
              int x = in.nextInt();
              int y = in.nextInt();
              for (int i = 0; i < n; i++) {
                  String str1 = in.next();
                  int p = 0;
                  int f = 0;
                  for (int j = 0; j < str1.length(); j++) {
                      if (str1.charAt(j) == 'p') p++;
                      else if (str1.charAt(j) == 'f') f++;
                  }
                  if (f >= x || (f == x - 1 && p >= y)) System.out.print('1');
                  else System.out.print('0');
              }
              System.out.println();
          }


}
