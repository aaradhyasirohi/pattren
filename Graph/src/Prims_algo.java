import java.util.*;

public class Prims_algo {
    int ans=0;
    public class primspair {
        int vtx;
        int acqvtx;
        int cost;

        public primspair(int vtx, int acqvtx, int cost) {
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

    public Prims_algo(int v) {
        this.map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void Addedge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public void primAlgo() {
        PriorityQueue<primspair> pq = new PriorityQueue<>(new Comparator<primspair>() {
            @Override
            public int compare(primspair o1, primspair o2) {
                return o1.cost - o2.cost;
            }
        });
        HashSet<Integer> visited = new HashSet<>();
        pq.add(new primspair(1, 1, 0));
        while (pq.isEmpty()) {
            // remove
            primspair pp = pq.remove();
            //ignore
            if (visited.contains(pp.vtx)) {
                continue;
            }
            // visited
            visited.add(pp.vtx);
            // print
            System.out.println(pp);
            ans=ans+pp.cost;
            // nbrs
            for (int nbrs : map.get(pp.vtx).keySet()) {
                if (!visited.contains(nbrs)) {
                    primspair np = new primspair(nbrs, pp.vtx, map.get(pp.vtx).get(nbrs));
                    pq.add(np);
                }
            }

        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Prims_algo pm = new Prims_algo(n);
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int v1 = in.nextInt();
            int v2 = in.nextInt();
            int cost = in.nextInt();
            pm.Addedge(v1, v2, cost);

        }
        pm.primAlgo();
    }

}

