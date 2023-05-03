public class bubble_sort {
    public static void main(String[] args) {
        int []arr={1,6,7,8,4,5};
        sort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
          public static void sort(int [] brr){
            for (int i = 0; i < brr.length-1 ; i++) {
                for (int j = 0; j < brr.length-i-1 ; j++) {
                      if(brr[j]>brr[j+1]){
                          int temp=brr[j];
                          brr[j]=brr[j+1];
                          brr[j+1]=temp;
                      }
                }
            }
        }

    }


