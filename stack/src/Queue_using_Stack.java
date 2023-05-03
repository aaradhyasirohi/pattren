public class Queue_using_Stack {
    private DynamicStack data;
    public Queue_using_Stack(){
      this.data=new DynamicStack();
    }
    public boolean isempty(){
       return this.data.isempty();
    }
    public int size(){
        return this.data.size();
    }
   public void enqueue(int x){

   }
   public int dequeue(){
        return 0;
   }
}
