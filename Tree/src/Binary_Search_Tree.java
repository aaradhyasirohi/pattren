public class Binary_Search_Tree {
    public class node{
        int data;
        node left;
        node right;
    }
    private node root;
    public Binary_Search_Tree(int [] in){
      this.root=createtree(in,0,in.length-1);
    }
    private node createtree(int[] in, int si,int ei){
        if(si>ei)return null;
        int mid=(si+ei)/2;
        node nn=new node();
        nn.data=in[mid];
        nn.left=createtree(in,si,mid-1);
        nn.right=createtree(in,mid+1,ei);
        
        return null;
    }

}
