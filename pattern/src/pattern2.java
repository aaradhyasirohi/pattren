import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int row=1;
        int space=0;
        int col=n;
        while (row<=n) {
            int i=1;
            while(i<=space) {
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=col){
                System.out.print("*"+" ");
                j++;
            }
            space++;
            col--;
            row++;
            System.out.println();
        }
    }
}

