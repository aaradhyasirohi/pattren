public class fac_recursion {
    public static void main(String[] args) {
        int n=7;
        System.out.println(fac(n,0));
    }
    static int fac(int n, int count){
        if(n==0){
            return count%2;
        }
        for (int i =1; i <= n; i++) {
            if(n%i==0){
                count++;
            }
        }
        return fac(n-1,count);
    }

}
