public class Solution {
    public static void main(String[] args) {
        int arr[] = {3, 2, 3, 6, 7, 5};
        int val = 3;
        System.out.println(removeElement(arr,val));
    }

    public static int removeElement(int[] nums, int val) {


        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }

        }
        return i;
    }
}