public class occurence {
    public static void main(String[] args) {
        int arr[]={1,3,5,7,7,7,9};
        int a=9;
        elem(a,arr);
        elem1(a,arr);
    }
    public static void elem(int a, int arr[]){
        for (int i = 0; i < arr.length ; i++) {
           if(arr[i]==a){
               System.out.println(i);;
               break;
           }
        }
    }
    public static void elem1(int a,int arr[]){
        for (int i = arr.length-1; i >=0 ; i++) {
              if(arr[i]==a){
                  System.out.println(i);
                  break;
              }
        }
    }

}
