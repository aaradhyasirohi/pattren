public class experimental_way {
     public static void main(String[] args) {
        long start=System.currentTimeMillis();
        int i=1;
        while(i<=50000){
            i++;
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
