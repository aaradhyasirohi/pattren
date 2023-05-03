public class Stack_using_Queue {
    private DynamicQueue data;
    public Stack_using_Queue(){
        this.data=new DynamicQueue();
    }
    public boolean isempty(){
        return this.data.isempty();
    }
   public int size(){
        return this.data.size();
   }
   // O(n)
   public void push(int item) throws Exception{
      // temporary queue
       DynamicQueue temp=new DynamicQueue();
        while(!this.data.isempty()){
            temp.enqueue(data.dequeue());
        }
        this.data.enqueue(item);
        while(!temp.isempty()){
            data.enqueue(temp.dequeue());
        }
   }
   public int pop() throws Exception{
        return this.data.dequeue();
   }
   public int peek() throws Exception{
        return this.data.getFront();
   }

}
