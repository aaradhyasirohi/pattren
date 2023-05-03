import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for (int row = 1; row <= 2*n-1; row++) {
            int x=row<=n?row:2*n-row;
            for (int col = 0; col <=x ; col++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
