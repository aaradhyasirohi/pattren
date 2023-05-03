import java.util.*;

public class krusal_algo {
    HashMap <Integer, HashMap<Integer,Integer>> map;
    public  krusal_algo (int v){
        this.map=new HashMap<>();
        for (int i = 1; i <=v ; i++) {
            map.put(i,new HashMap<>());
        }
    }
    public void  Addedge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public class edgepair{
        int e1;
        int e2;
        int cost;
        public edgepair(int e1,int e2,int cost){
            this.cost=cost;
            this.e1=e1;
            this.e2=e2;
        }
        @Override
        public String toString(){
            return e1+"--" +e2+" " +"@"+" "+cost;
        }
    }
    public ArrayList<edgepair> getalledge(){
        ArrayList<edgepair> list=new ArrayList<>();
        for(int e1: map.keySet()){
            for (int e2:map.get(e1).keySet()){
                edgepair eg=new edgepair(e1,e2,map.get(e1).get(e2));
                list.add(eg);
            }
        }
        return list;
    }
    ///
    public void kruskalAlgo(){
        int ans=0;
        Disjoint_Set ds=new Disjoint_Set();
         for (int k: map.keySet()){
             ds.createSet(k);
         }
         ArrayList<edgepair> ll=getalledge();
        Collections.sort(ll, new Comparator<edgepair>() {
            @Override
            public int compare(edgepair o1, edgepair o2) {
                return o1.cost-o2.cost;
            }
        });
        for (edgepair edge:ll){
           int e1=edge.e1;
           int e2=edge.e2;
           int re1=ds.find(e1);
           int re2=ds.find(e2);
           if(re1==re2) {

           }
           else {
               ans=ans+ edge.cost;
               System.out.println(edge);
               ds.union(re1,re2);
           }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
         int n=in.nextInt();
         krusal_algo ks=new krusal_algo(n);
         int m=in.nextInt();
          for (int i=0;i<m;i++){
              int v1=in.nextInt();
              int v2=in.nextInt();
               int cost=in.nextInt();
              ks.Addedge(v1,v2,cost);
              
          }
          ks.kruskalAlgo();
    }
    /* 4 5
    1 2 10
    2 3 15
    1 3 5
    4 2 2
    4 3 40
     */
}
