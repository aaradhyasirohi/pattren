public class DynamicStack extends Stack {
    @Override
    public void push(int item) throws Exception{
      if(this.isfull()){
          int arr[]=new int[2*this.data.length ];
          for (int i=0;i<this.data.length;i++){
              arr[i]=this.data[i];
          }
          this.data=arr;
      }
      super.push(item);
    }
    
}
