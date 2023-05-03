public class encap {
    public static void main(String[] args) {
        Laptop l1=new Laptop();
        //l1.price=237083;                
        l1.ram=4;
        l1.setPrice(45);
    }


}
class Laptop{
    int ram;
   private int price;
   public void setPrice(int price){
       // is the user is admin?
       boolean isAdmin =false;
         if(!isAdmin){
             System.out.println(" you cannot set the price");
         }
         else
       this.price=price;
   }

}
