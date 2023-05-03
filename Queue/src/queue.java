public class queue {
  protected int[] data;
  protected int front=0;
  protected int size=0;
  public queue(){
      this.data=new int[5];
  }
  public queue(int cap){
      this.data=new int[cap];
  }
   public boolean isempty(){
         return this.size==0;
   }
   public boolean isfull(){
      return this.size==this.data.length;
   }
    public int size(){
      return this.size;
    }

     public void enqueue(int item) throws Exception{
      if(isfull()){
          throw new Exception("queue is full");
      }
      int i=(this.size+this.front)%this.data.length;
       this.data[i]=item;
       size++;
     }
     public int dequeue() throws Exception{
      if(isempty()){
          throw new Exception("QUEUE IS EMPTY");
      }
      int rv=this.data[front];
      this.front=(this.front+1)%this.data.length;
      this.size--;
      return rv;
     }
      public int getFront(){
      return this.data[this.front];
      }

    public void display() {
        for (int i = 0; i < size; i++) {
            int idx=(this.front+i)%this.data.length;
            System.out.print(this.data[idx]+" ");
        }
        System.out.println();
    }

}
