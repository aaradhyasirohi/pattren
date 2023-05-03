import java.util.Scanner;

public class fibonnic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int a=0;
        int b=1;
        for (int i = 1; i <=n; i++) {
              int c=a+b;
              a=b;
              b=c;
            System.out.println(a);
        }
       
    }
}
