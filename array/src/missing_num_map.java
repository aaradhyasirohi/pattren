import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import java.util.*;
public class missing_num_map {
    static int miss(int arr[],int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(arr);
        for (int i = 0; i <n ; i++) {
          map.put(i+1,arr[i]);
        }
        for (Map.Entry<Integer,Integer> c: map.entrySet()) {
             if(c.getKey()!=c.getValue()) {
                 return c.getValue()+1 ;
             }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println(miss(arr,n));
    }
}
