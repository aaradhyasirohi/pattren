public class count_zero {
    public static void main(String[] args) {
        int n=30402;
        System.out.println(count1(n));
    }
    static int count1(int n){
        return count(n,0);
    }

   public static int  count(int n,int count){
        if(n==0){
            return count;
        }
        if(n%10==0){
           return count(n/10,count+1);
        }
          return  count(n/10,count);
    }

}
