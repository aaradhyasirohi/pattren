public class A_practice {
   final static int studentsno =78;
    String name;
    private int rollnum;

        public String str(String st){
        return this.name=st;
    }
   // Constructor
   public  A_practice(String st, int num){
        this.name=st;
       this.rollnum=num;
    }
    // Copy Constructor
    public A_practice(A_practice s){
        this.name=s.name;
        this.rollnum=s.rollnum;
    }
    public int num(){
        return studentsno;
    }
    public void result (){
        System.out.println(name+" "+studentsno+" "+ rollnum);
    }
}
