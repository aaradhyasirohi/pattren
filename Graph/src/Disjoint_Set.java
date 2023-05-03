import java.util.HashMap;

public class Disjoint_Set {
    public class node{
        int val;
        int rank;
        node parent;
    }
    HashMap<Integer,node> map=new HashMap<>();
    public void createSet(int v){
       node nn =new node();
       nn.val=v;
        nn.rank=0;
        nn.parent=nn;
        map.put(v,nn);
    }
    public int find(int v){
      node nn= map.get(v);
      return find(nn).val;
    }
    private node find(node nn){
        if(nn.parent==nn){
            return nn;
        }
        return find(nn.parent);
    }
    public void union(int v1,int v2){
        node n1= map.get(v1);
        node n2= map.get(v2);
        node rn1=find(n1);
        node rn2=find(n2);
        if(rn1.rank==rn2.rank){
            rn1.parent=rn2;
            rn2.rank= rn2.rank+1;
        }
        else if(rn1.rank > rn2.rank){
            rn2.parent=rn1;
        }
        else {
            rn1.parent=rn2;
        }
    }
}
