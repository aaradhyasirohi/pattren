import java.util.Scanner;

public class codechef {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for (int i = 1; i <= n; ++i) {
            int m= in.nextInt();
            int count =0;
            for (int j = 0; j < m; j++) {
                for (int k = 0; k <m ; k++) {
                   if((k+j)%2!=0){
                       count++;
                }
            }

        }
            System.out.println(count);
    }
} }
