import java.util.ArrayList;
import java.util.Scanner;

public class list23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        //add method
        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.add(i)+" ");

        }
        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i)+" ");

        }
    }
}
