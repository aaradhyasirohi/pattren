   class pen {
    String color; //property
    String type;
      public void write(){
          System.out.println("writing something");
      }   //method
       public void printcolor(){
           System.out.println(this.color);
       }
   }

public class oops1 {
    public static void main(String[] args) {
        pen pen1=new pen();//object
        pen1.color="red";
        pen1.type="gel";
       // pen1.write();
        pen pen2=new pen();//object
        pen2.color="blue";
        pen2.type="ball";
        //pen2.write();
        pen1.printcolor();
        pen2.printcolor();
    }
}
