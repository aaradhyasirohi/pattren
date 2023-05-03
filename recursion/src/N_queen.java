public class N_queen {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        Nqueen(n,board,0);
    }
    public static boolean isitsafe(boolean[][] board,int row,int col) {
      int r=row;
      while(r>=0){
          if(board[r][col]==true){
              return false;
          }
          r--;
      }
      //right diagonal
      r=row;
      int c=col;
      while (r>=0 &&c<board.length){
          if(board[r][c]==true){
              return false;
          }
          r--;
          c++;
      }

        r=row;
        c=col;
        while (r>=0 &&c>=0){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c--;
        }
        return true;
    }
    public static  void Nqueen (int n,boolean[][] board,int row) {
        if(n==0){
            display(board);
            System.out.println();
            return;
        }
        for (int col = 0; col <board.length ; col++) {
                if(isitsafe(board,row,col)) {
                    board[row][col]=true;
                    Nqueen(n-1,board,row+1);
                    board[row][col]=false;
                }
        }
    }
    public static void display(boolean[][] board){
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board.length ; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
