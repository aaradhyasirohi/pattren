import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern5(n);
    }

    public static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    //patern 2
    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int freespace = 1; freespace <= n - i; freespace++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int freespace = 0; freespace < i - 1; freespace++) {
                System.out.print(" ");
            }
            for (int j = n - i + 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int freespace = 0; freespace < n - i; freespace++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for(int space=0;space<i-1;space++ ) {
                System.out.print(" ");
            }
                for (int j = n - i + 1; j >= 1; j--) {
                    System.out.print("* ");
                }

            System.out.println();
        }
    }
}

