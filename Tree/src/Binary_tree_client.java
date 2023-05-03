public class Binary_tree_client {
    public static void main(String[] args) {
        Binary_tree bt=new Binary_tree();
        bt.display();
        // input:  10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
        System.out.println(bt.max());
        System.out.println(bt.find(30));
        System.out.println(bt.ht());
        bt.Preorder();
        bt.Postorder();
        bt.Inorder();
    }
}
