public class reverse_queue {
    public static void main(String[] args) throws Exception {
        DynamicQueue dq= new DynamicQueue();
        dq.enqueue(56);
        dq.enqueue(6);
        dq.enqueue(5);
        dq.enqueue(89);
        dq.display();
        Reverse(dq);
        dq.display();

    }
    private  static void Reverse(DynamicQueue dq)throws Exception{
        if(dq.isempty())return;
        int x=dq.dequeue();
         Reverse(dq);
         dq.enqueue(x);
    }

}
