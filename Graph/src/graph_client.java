import java.util.HashMap;
import java.util.HashSet;

public class graph_client {
    public static void main(String[] args) {
        graph_usinghashmap g=new graph_usinghashmap(7);
        g.Addedge(1,4,6);
        g.Addedge(2,6,16);
        g.Addedge(6,5,36);
        g.Addedge(3,4,76);
        g.Addedge(5,4,46);
        g.Addedge(7,3,26);
        g.Addedge(6,2,86);
        g.display();
        g.Remove_edge(1,4);
        g.display();
        System.out.println(g.hasPath(5, 4, new HashSet<>()));
        g.printallpath(1, 4, new HashSet<>(),"");
    }
}
