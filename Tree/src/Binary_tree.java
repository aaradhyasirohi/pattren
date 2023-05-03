import java.util.LinkedList;
import java.util.Scanner;

public class Binary_tree {
    Scanner in =new Scanner(System.in);
    public class node {
          int data;
          node left;
          node right;
    }
    private node root;

    public Binary_tree(){
        this.root=createTree();
    }
    private node createTree(){
         int item =in.nextInt();
          node nn =new node();
           nn.data=item;
           boolean hasleftchild=in.nextBoolean();
           if(hasleftchild==true){
               nn.left=createTree();
           }
        boolean hasrightchild=in.nextBoolean();
        if(hasleftchild==true){
            nn.right=createTree();
        }
           return nn;
    }
    public void display(){
     display(this.root);
    }
    private void display(node nn){
        if(nn==null){
            return;
        }
      String str="";
      str=str+nn.data;
       str="<--"+str+"-->";
       if(nn.left!=null){
          str=nn.left.data+str;
       }
       else{
           str="."+str;
       }
        if(nn.right!=null){
            str=str+nn.right.data;
        }
        else{
            str=str+".";
        }
        System.out.println(str);
        display(nn.left);
        display(nn.right);
    }
     public int max(){
        return max(this.root);
     }
     private int max(node nn){
        if(nn==null) {
            return Integer.MIN_VALUE;
        }
        int lmax=max(nn.left);
         int rmax=max(nn.right);
         return Math.max(lmax,Math.max(rmax,nn.data));
     }
     // find
    public boolean find(int item){
        return find(this.root,item);
    }
    private boolean find(node nn,int item){
        if(nn==null)return  false;
        if(nn.data==item){
            return true;
        }
         return find(nn.left,item)|| find(nn.right,item);
    }
    //height
    public int ht(){
        return ht(this.root);
    }
    private int ht(node nn){
        if(nn==null) {
            return -1;
        }
        int lh=ht(nn.left);
        int rh=ht(nn.right);
        return Math.max(lh,rh)+1;
    }
    //traversing
    public void Preorder(){
        Preorder(this.root);
        System.out.println();
    }
    private void Preorder(node nn){
        if(nn==null)return;
        System.out.print(nn.data+" ");
        Preorder(nn.left);
        Preorder(nn.right);
    }
    public void Postorder(){
        Postorder(this.root);
        System.out.println();
    }
    private void Postorder(node nn){
        if(nn==null)return;

        Postorder(nn.left);
        Postorder(nn.right);
        System.out.print(nn.data+" ");
    }
    public void Inorder(){
        Inorder(this.root);
        System.out.println();
    }
    private void Inorder(node nn){
        if(nn==null)return;

        Inorder(nn.left);
        System.out.print(nn.data+" ");
        Inorder(nn.right);
    }
    //  level order
      public void levelorder(){
          LinkedList<node> queue =new LinkedList<>();
          queue.add(this.root);
          while(!queue.isEmpty()){
             node rv=queue.remove();
              System.out.print(rv.data+" ");
              if(rv.left!=null)queue.add(rv.left);
              if(rv.right!=null)queue.add(rv.right);
          }
          System.out.println();
      }
}
