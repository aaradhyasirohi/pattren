public class wave_array {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3,4},{5,7,8,9,4},{10,13,56,89}};
        print(arr);
    }
    public static void print(int [][] arr) {
        for (int col = 0; col < arr[0].length; col++) {
            if(col%2==0){
                for (int row = 0; row <arr.length ; row++) {
                    System.out.print(arr[row][col]+" ");
                }
            }
            else{
                for (int row = arr.length-1; row >=0 ; row--) {
                    System.out.print(arr[row][col]+" ");
                }
            }
            System.out.println();
        }
    }
}

