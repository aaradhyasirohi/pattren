public class semi_optimesd {
    public static void main(String[] args) {
        int n=6;
        boolean a =isprime(n);
        System.out.println(a);

    }
    public static boolean isprime(int n){
        int div =2;
        while (div*div <=n){
            if(n%div==0){
                return false;
            }
            div++;
        }
        return true;
    }
}
