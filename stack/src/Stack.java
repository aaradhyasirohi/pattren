public class Stack {
     protected int[] data;
     int top=0;
      public Stack(){
          this.data=new int[5];
    }
    public Stack(int cap){
          this.data=new int[cap];
    }
    public boolean isempty(){
      return top==0;
    }
    public boolean isfull(){
        return this.top==this.data.length;
    }
     public void push(int item) throws Exception{
          if(isfull())
            {
              throw new Exception("STACK OVERFLOW");
             }
         this.data[top]=item;
        this.top++;
     }
     public int pop() throws Exception{
         if(isfull()){
             throw new Exception("STACK empty");
         }
         this.top--;
         return this.data[top];
     }
     public int peek(){
          return this.data[top-1];
     }
      public int size(){
          return this.top;
      }
     public  void display() {
         for (int i = 0; i < top; i++) {
             System.out.print(this.data[i] + " ");
         }
         System.out.println();

     }
}
