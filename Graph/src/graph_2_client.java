public class graph_2_client {
    public static void main(String[] args) {
      graph_2 g=new graph_2(7);
      g.Addedge(1,4,6);
        g.Addedge(1,2,6);
        g.Addedge(2,3,6);
        g.Addedge(3,4,6);
        g.Addedge(4,5,6);
        g.Addedge(5,6,6);
        g.Addedge(7,5,6);
        g.Addedge(6,7,6);
      System.out.println(g.BSF(1,
              6));
      g.BST();
      System.out.println(">>>>");
      g.DFT();
      System.out.println(g.cycle());
      System.out.println(g.Isconnected());
    }
}
