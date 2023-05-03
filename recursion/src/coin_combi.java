public class coin_combi {
    public static void main(String[] args) {
             int n=7;
            cointoss(n," ");

    }
    public static void cointoss(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
       cointoss(n-1,ans+"H");
       cointoss(n-1,ans+"T");
    }
}
