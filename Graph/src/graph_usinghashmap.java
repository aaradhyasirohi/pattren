import java.util.HashMap;
import java.util.HashSet;

public class graph_usinghashmap {
    HashMap <Integer,HashMap<Integer,Integer>> map;
    public  graph_usinghashmap (int v){
       this.map=new HashMap<>();
        for (int i = 1; i <=v ; i++) {
           map.put(i,new HashMap<>());
        }
    }
    public void  Addedge(int v1,int v2,int cost){
       map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public boolean containEdge(int v1,int v2){
        return map.get(v1).containsKey(v2);
    }
    public  boolean containVertex(int v){
        return map.containsKey(v);
    }
    public int no_of_edge(){
        int sum=0;
        for (int key:map.keySet()){
          sum=sum+map.get(key).size();
        }
        return sum/2;
    }
    public void Remove_edge(int v1,int v2){
         if(containEdge(v1,v2)){
             map.get(v1).remove(v2);
             map.get(v2).remove(v1);
         }
    }
  public void remove_vertex(int v){
        for(int key:map.get(v).keySet()){
           map.get(key).remove(v);
        }
        map.remove(v);
  }
  public void display(){
        for(int key :map.keySet()){
            System.out.println(key +"-->"+map.get(key));
        }
  }
  public boolean hasPath(int s , int d, HashSet<Integer> visted){
     if(s==d) return true;
     visted.add(s);
     for (int nbrs:map.get(s).keySet()){
         if(!visted.contains(nbrs)){
         boolean ans= hasPath(nbrs,d,visted);
         if(ans){
             return ans;
         }
     }  }
     return false;
  }
  public void printallpath(int s,int d,HashSet<Integer> visited,String str){
        if(s==d){
            System.out.println(str+s);
            return;
        }
        visited.add(s);
        for (int nbrs:map.get(s).keySet()){
            if(!visited.contains(nbrs)){
                printallpath(nbrs,d,visited,str+s+" ");
            }
        }
        visited.remove(s);

  }

}

