public class intersection {
    public static class listnode{
        int val;
        listnode next;
        listnode(){};
        listnode(int val){this.val=val;}
        listnode(int val, listnode next){
            this.val=val;
            this.next=next;
        }
    }
    public class Solution {
        public listnode getIntersectionNode(listnode headA, listnode headB) {
           listnode a=headA;
           listnode b=headB;
           while(a!=b){
               if(a==null)a=headB;
               else a=a.next;
               if(b==null)b=headA;
                else b=b.next;
           }
           return a;
        }
          }

          // merge two node

    public class Solution1 {
        public listnode getIntersectionNode(listnode list1, listnode list2) {
            listnode dummy =new listnode();
            listnode temp=dummy;
            while(list1!=null &&list2!=null){
                if(list1.val<list2.val){
                    temp.next=list1;
                    temp=temp.next;
                    list1=list1.next;
                }
                else {
                    temp.next=list2;
                    temp=temp.next;
                    list2=list2.next;
                }
            }
            if(list1==null)temp.next=list2;
            if(list2==null)temp.next=list1;
            return dummy.next;
        }
     }
}

