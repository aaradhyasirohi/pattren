import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class bellman_for {
    HashMap<Integer, HashMap<Integer, Integer>> map;
    public bellman_for(int v) {
        this.map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void Addedge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);// directed graph

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
     public void bellmanfordalgo(){
         int v=map.size();
         int [] dsu= new int[v+1];
         for (int i=2;i<=v;i++){
             dsu[i]=100000000;
         }
         ArrayList<edgepair> list=getalledge();
         for (int i = 1; i <=v; i++) {
             for (edgepair eg:list){
                 int e1=eg.e1;
                 int e2=eg.e2;
                 int oldcost=dsu[e2];
                 int newcost=dsu[e1] +eg.cost;
                 if(i==v && newcost<oldcost){
                     System.out.println("-ve weight ka cycle hai");
                     return;
                 }
                 if(oldcost>newcost){
                     dsu[e2]=newcost;
                 }   }
         }
             for (int i = 1; i < dsu.length; i++) {
                 System.out.println(dsu[i]);
             }
     }

    public static void main(String[] args) {
       bellman_for bfd=new bellman_for(5);
       bfd.Addedge(1,2,8);
       // bfd.Addedge(2,5,-2);
        bfd.Addedge(2,5,2);
        bfd.Addedge(5,2,1);
        bfd.Addedge(4,5,4);
        bfd.Addedge(3,4,-3);
        bfd.Addedge(1,3,4);
        bfd.Addedge(1,4,5);
        bfd.bellmanfordalgo();
    }
}
