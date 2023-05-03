public class linkedlist_ques {
    public static void main(String[] args) {
        listnode nn =new listnode(5);


    }
    public static class listnode{
        int val;
        listnode next;
        listnode(){};
        listnode(int val){this.val=val;}
        listnode(int val,listnode next){
            this.val=val;
            this.next=next;
        }
    }
  class solu{
        public listnode middlenode(listnode head){
           listnode f=head;
           listnode s=head;
           while(f!=null && f.next!=null){
             f=f.next.next;
             s=s.next;
           }
           return s;
        }

   }
}
