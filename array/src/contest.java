import java.util.Scanner;

public class contest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            int m = in.nextInt();
            int a = 0;
            int b = 0;
            int d = 0;

            for (int j = 0; j < n; j++) {
               ;              int c=0;

                while (arr[i] != -1) {
                    for (int k = j + 1; k < n; k++) {
                        int temp = arr[i] + arr[j];
                        if (temp == m) {
                            if (arr[i] > arr[j]) {
                                c = arr[i] - arr[j];
                            } else {
                                c = arr[j] - arr[i];
                            }  }
                            if (c > d) {
                                d = c;
                                a = arr[i];
                                b = arr[j];
                              }
                            arr[j] = -1;

                    }
                }

            }
            System.out.println("Deepak should buy roses whose prices are" + a + "and " + b + ".");

            }
        }
    }
