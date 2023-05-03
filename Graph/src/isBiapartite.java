import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class isBiapartite {
    public class bipartite{
        int vtx;
        int d;
        public bipartite(int vtx,int d){
            this.d=d ;
            this.vtx=vtx;
        }
    }
    class Solution {
        public boolean isBipartite(int[][] graph) {
            HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
            for (int i = 0; i < graph.length; i++) {
                map.put(i, new HashMap<>());
            }
            for (int i = 0; i < graph.length; i++) {
                for (int j = 0; j < graph[i].length; j++) {
                    map.get(i).put(graph[i][j], 7);
                }
            }
            return isBiapartite(map);
        }


        public boolean isBiapartite(HashMap<Integer, HashMap<Integer, Integer>> map) {
            LinkedList<bipartite> qq = new LinkedList<>();
            HashMap<Integer, Integer> visited = new HashMap<>();
            for (int s : map.keySet()) {    // for all components of graph
                if (visited.containsKey(s)) continue;
                bipartite bp = new bipartite(s, 0);
                qq.add(bp);
                while (!qq.isEmpty()) {
                    // remove
                    bipartite r = qq.remove();
                    //ignoreif already visited
                    if (visited.containsKey(r.vtx) && r.d != visited.get(r.vtx)) {
                        return false;
                    }
                    // visited mark
                    visited.put(r.vtx, r.d);
                    // work
                    System.out.println(r + " ");
                    // neighbour add krnA
                    for (int nbrs : map.get(r.vtx).keySet()) {
                        if (!visited.containsKey(nbrs)) {
                            bipartite nbp = new bipartite(nbrs, r.d + 1);
                            qq.add(nbp);
                        }
                    }
                }
            }
            return true;
        }
    }
}
