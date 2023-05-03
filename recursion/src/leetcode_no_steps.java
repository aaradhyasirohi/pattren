public class leetcode_no_steps {

    //1342. Number of Steps to Reduce a Number to Zero
    public static void main(String[] args) {
        int num=14;
        System.out.println(numberOfSteps(num));
    }
    public static int numberOfSteps(int num) {
      return   helper(num,0);

    }
    public static int helper (int num,int count)   {
         if(num==0){
             return count;
         }
         if(num%2==0){
             return helper(num/2,count+1);
         }
         return helper(num-1,count+1);
    }
}
