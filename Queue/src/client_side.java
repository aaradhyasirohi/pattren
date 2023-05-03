public class client_side {
    public static void main(String[] args) throws Exception {
        queue q=new queue();
        q.enqueue(9);
        q.enqueue(9);
        q.enqueue(80);
        q.display();
        q.dequeue();
        q.display();
    }


}
