public class abstraction {
    public static void main(String[] args) {
       audi a1= new audi();
       a1.start();
    }
}
class audi extends car{
    @Override
    void start() {
        System.out.println("audi is starting");
    }
}
class bmw extends car{
    void start() {
        System.out.println("bmw is starting");
    }
}
 abstract class car{  // now cannot make its object
  String brand;
  int price;
  abstract void start(); // abstract function have no defination

}
