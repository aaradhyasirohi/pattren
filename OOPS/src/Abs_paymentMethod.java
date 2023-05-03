public class Abs_paymentMethod extends Abs_bankaccount {
    @Override
    public boolean payment(){
      return false;
    }

    public static void main(String[] args) {
        Abs_paymentMethod pp = new Abs_paymentMethod();
        pp.payment();
    }

}
