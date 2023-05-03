import java.util.Scanner;

//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
public class missing_num {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
           int arr[]={1,4,0};

         int r= missingNumber(arr);
        System.out.println(r);


    }
        public static int missingNumber(int[] nums) {
            int i=0;
            while(i<nums.length){
                 int correct =nums[i];

                 if( nums[i]<nums.length && nums[correct]!=nums[i] ){
                     int temp =nums[i];
                     nums[i]=nums[correct];
                     nums[correct]=temp;
                 }
                 else{
                     i++;
                 }
            }
            for (int j = 0; j < nums.length; j++) {
                  if(nums[j]!=j){
                     return j;
                  }
            }
            return nums.length;
    }

        }

