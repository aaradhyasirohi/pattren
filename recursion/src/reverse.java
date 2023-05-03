public class reverse {
    public static void main(String[] args) {
        int num =1234;
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        System.out.println(fun1(num,(int)Math.pow(10,count)));;

    }
    static int sum =0;;
    public static void fun(int num){

        if(num==0){
           return;
        }
          int rem=num%10;
        sum=sum*10 +rem;
        fun(num/10);


    }
    public static int fun1( int num, int argu){
        if(num%10==num){
            return num;
        }
        int rem = num%10;
       return  rem*(int)Math.pow(10,argu-1) + fun1(num/10,argu-1);

    }

}
