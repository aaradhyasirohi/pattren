public class table_re {
//    public static void Table(int n,int i){
//        if(i==11){
//            return;
//        }
//        System.out.println(n*i);
//        Table(n,i+1);
//    }

    //to count zero
   /* public static void digit(int n,int c) {
        if (n == 0) {

            System.out.println(c);  return ;
        }
        int temp=n%10;
        if(temp==0){
            digit(n/10,c+1);
        }
        else{
            digit(n/10,c);
        }
    } */
    public static void leetcode(int n,int i,int c){
          if(n==0){
              System.out.println("\n"+c);
              return;
          }
       if(i%2==0){
           System.out.println(n/2);
           leetcode(n/2,i+1,c+1);
       }
         else
       {
           System.out.println(n-1);
           leetcode(n-1,i+1,c+1);
       }  }

    public static void main(String[] args) {
//      int n=6;
//      Table(n,1);
        int n=14;
        int c=2;
        leetcode(n,c,0  );
       
   }
}
