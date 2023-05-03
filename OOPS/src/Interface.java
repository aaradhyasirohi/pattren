import javax.xml.crypto.dsig.Transform;

public class Interface implements car1 ,car2 {
    public static void main(String[] args) {
        Interface in = new Interface();
    }

    @Override
    public void start() {
        System.out.println("this is my car");
    }
    public void run(){
        System.out.println("car is running");
    }

}
interface car1{
   void start();
}
interface car2{
    void run();
}

