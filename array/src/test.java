public class test {
    public static void main(String[] args) {

        int[] nums ={-2,1,-3,4,-1,2,1,-5,4};
            int n=nums.length;
            int max=Integer.MIN_VALUE;
            int sum=0;
            for(int i=0;i<n;i++){
                sum=sum+nums[i];
                if(sum>max)max=sum;
                if(sum<0){
                    sum=0;
                }
            }
       // return sum;
        System.out.println(max);
        }
      

}
