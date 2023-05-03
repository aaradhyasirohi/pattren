import java.util.*;

import java.util.HashMap;

public class graph_2 {
        HashMap <Integer, HashMap<Integer,Integer>> map;
        public  graph_2 (int v){
            this.map=new HashMap<>();
            for (int i = 1; i <=v ; i++) {
                map.put(i,new HashMap<>());
            }
        }
        public void  Addedge(int v1,int v2,int cost){
            map.get(v1).put(v2,cost);
            map.get(v2).put(v1,cost);
        }
        public boolean BSF(int s,int d){
            LinkedList<Integer> qq= new LinkedList<>();
            HashSet<Integer> visited =new HashSet<>();
            qq.add(s);
            while(!qq.isEmpty()){
                // remove
                int r=qq.remove();
                //ignoreif already visited
                if(visited.contains(r)){
                    continue;
                }
                // visited mark
                visited.add(r);
                 // work
                if(r==d){
                    return true;
                }
                // neighbour add krnA
                for (int nbrs : map.get(r).keySet()) {
                  if(!visited.contains(nbrs)){
                      qq.add(nbrs);
                  }
                }
            }
            return false;
        }
    public boolean DFS(int s,int d){
        Stack<Integer> st= new Stack<>();
        HashSet<Integer> visited =new HashSet<>();
        st.push(s);
        while(!st.isEmpty()){
            // remove
            int r=st.pop();
            //ignoreif already visited
            if(visited.contains(r)){
                continue;
            }
            // visited mark
            visited.add(r);
            // work
            if(r==d){
                return true;
            }
            // neighbour add krnA
            for (int nbrs : map.get(r).keySet()) {
                if(!visited.contains(nbrs)){
                   st.push(nbrs);
                }
            }
        }
        return false;
    }
    // BST
    public void BST(){
        LinkedList<Integer> qq= new LinkedList<>();
        HashSet<Integer> visited =new HashSet<>();
        for(int s: map.keySet()) {    // for all components of graph
            if(visited.contains(s)) continue;
            qq.add(s);
            while (!qq.isEmpty()) {
                // remove
                int r = qq.remove();
                //ignoreif already visited
                if (visited.contains(r)) {
                    continue;
                }
                // visited mark
                visited.add(r);
                // work
                System.out.println(r + " ");
                // neighbour add krnA
                for (int nbrs : map.get(r).keySet()) {
                    if (!visited.contains(nbrs)) {
                        qq.add(nbrs);
                    }
                }
            }
        }
    }
    // DFT
    public void DFT(){
        Stack<Integer> st= new Stack<>();
        HashSet<Integer> visited =new HashSet<>();
        for(int s: map.keySet()) {    // for all components of graph
            if(visited.contains(s)) continue;
            st.push(s);
            while (!st.isEmpty()) {
                // remove
                int r = st.pop();
                //ignoreif already visited
                if (visited.contains(r)) {
                    continue;
                }
                // visited mark
                visited.add(r);
                // work
                System.out.print(r + " ");
                // neighbour add krnA
                for (int nbrs : map.get(r).keySet()) {
                    if (!visited.contains(nbrs)) {
                       st.push(nbrs);
                    }
                }
            }
        }
    }
    // to check cycle
    public boolean cycle(){
        LinkedList<Integer> qq= new LinkedList<>();
        HashSet<Integer> visited =new HashSet<>();
        for(int s: map.keySet()) {    // for all components of graph
            if(visited.contains(s))  return true;
            qq.add(s);
            while (!qq.isEmpty()) {
                // remove
                int r = qq.remove();
                //ignoreif already visited
                if (visited.contains(r)) {
                    continue;
                }
                // visited mark
                visited.add(r);
                // work
                System.out.println(r + " ");
                // neighbour add krnA
                for (int nbrs : map.get(r).keySet()) {
                    if (!visited.contains(nbrs)) {
                        qq.add(nbrs);
                    }
                }
            }
        }
        return false;
    }
    // is connected
    public boolean Isconnected(){
        LinkedList<Integer> qq= new LinkedList<>();
        HashSet<Integer> visited =new HashSet<>();
        int c=0;
        for(int s: map.keySet()) {    // for all components of graph
            if(visited.contains(s)) continue;
            c++;
            qq.add(s);
            while (!qq.isEmpty()) {
                // remove
                int r = qq.remove();
                //ignoreif already visited
                if (visited.contains(r)) {
                  continue;
                }
                // visited mark
                visited.add(r);
                // neighbour add krnA
                for (int nbrs : map.get(r).keySet()) {
                    if (!visited.contains(nbrs)) {
                        qq.add(nbrs);
                    }
                }
            }
        }
        return c==1;
    }
}
