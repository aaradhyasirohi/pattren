import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijkstra {
    public class dijkstrapair {
        int vtx;
        String acqvtx;
        int cost;

        public  dijkstrapair(int vtx, String acqvtx, int cost) {
            this.vtx = vtx;
            this.acqvtx = acqvtx;
            this.cost = cost;
        }
        @Override
        public String toString(){
            return this.vtx+"--" +this.acqvtx+" " +"@"+" "+cost;
        }
    }
    HashMap<Integer, HashMap<Integer, Integer>> map;
    public Dijkstra(int v) {
        this.map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void Addedge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }
   public void dijkstra(){
       PriorityQueue<dijkstrapair> pq = new PriorityQueue<>(new Comparator<dijkstrapair>() {
           @Override
           public int compare(dijkstrapair o1, dijkstrapair o2) {
               return o1.cost - o2.cost;
           }
       });
       HashSet<Integer> visited = new HashSet<>();
       pq.add(new dijkstrapair(1,"1",0));
       while (!pq.isEmpty()){
        dijkstrapair dp=pq.remove();
        if(visited.contains(dp.vtx)){
          continue;
         }
        visited.add(dp.vtx);
           System.out.println(dp);
           for(int nbrs:map.get(dp.vtx).keySet()){
               
               if(!visited.contains(nbrs)){
                   int noc=dp.cost+map.get(dp.vtx).get(nbrs);
                   dijkstrapair ndp=new dijkstrapair(nbrs, dp.acqvtx+nbrs,noc);
                   pq.add(ndp);
               }
           }
       }
   }

    public static void main(String[] args) {
        Dijkstra pa=new Dijkstra(7);
        pa.Addedge(1,2,2);
        pa.Addedge(2,3,3);
        pa.Addedge(1,4,10);
        pa.Addedge(4,5,8);
        pa.Addedge(3,4,1);
        pa.Addedge(5,6,5);
        pa.Addedge(5,7,6);
        pa.Addedge(6,7,4);
        pa.dijkstra();
    }

}
