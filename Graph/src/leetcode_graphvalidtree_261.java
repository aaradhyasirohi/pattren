import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class leetcode_graphvalidtree_261 {
      class Solution{
            public boolean validTree(int n,int[][] edges){
                  HashMap<Integer,HashMap<Integer,Integer>> map= new HashMap<>();
                  for (int i = 0; i <n ; i++) {
                    map.put(i,new HashMap<>());
                  }
                  for (int i = 0; i < edges.length; i++) {
                     int v1=edges[i][0];
                     int v2=edges[i][1];
                  }
                  return isTree(map);
            }
            public boolean isTree(HashMap<Integer,HashMap<Integer,Integer>> map){
                Stack<Integer> st= new Stack<>();
                HashSet<Integer> visited =new HashSet<>();
                int c=0;
                for(int s: map.keySet()) {    // for all components of graph
                    if(visited.contains(s)) continue;
                    c++;
                    st.push(s);
                    while (!st.isEmpty()) {
                        // remove
                        int r = st.pop();
                        //ignoreif already visited
                        if (visited.contains(r)) {
                           return false;
                        }
                        // visited mark
                        visited.add(r);
                        // work
                       // System.out.print(r + " ");
                        // neighbour add krnA
                        for (int nbrs : map.get(r).keySet()) {
                            if (!visited.contains(nbrs)) {
                                st.push(nbrs);
                            }
                        }
                    }
                }
                return c==1;
            }

      }
}
