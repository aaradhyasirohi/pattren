public class DynamicQueue extends queue {
    public int length;

    @Override
    public void enqueue(int item) throws Exception{
       if(super.isfull()){
           int arr[]=new int[2*super.data.length];
           for (int i = 0; i < this.size; i++) {
               int idx=(this.front+i)%this.data.length;
               arr[i]=data[idx];
           }
           this.data=arr;
           this.front=0;

       }
          super.enqueue(item);
    }
}


