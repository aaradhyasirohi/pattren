import java.util.Scanner;

public class pattern3{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int row=1;
        int star=1;
        int space=n-1;
        while(row<=n) {
            //space
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++ ;
            }
            //star
            int j=1;
            while(j<=star){
                System.out.print("*"+" ");
                j++;
            }
            star++;
            row++;
            space--;
            System.out.println();
        }
    }

}
