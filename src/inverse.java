import java.util.Scanner;

public class inverse {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        int sum=0;
        int pos =1;
        while (n>0) {
            int rem =n%10;
            sum =(int)( sum +pos*Math.pow(10,rem-1));
                n=n/10;
                pos++;
        }
        System.out.println(sum);
    }
}
