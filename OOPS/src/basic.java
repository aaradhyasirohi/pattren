public class basic {
    public static void main(String[] args) {
        //objexts
        //    Person p1=new Person();
//      p1.age=24;
//      p1.name="khushi";
        Person p2=new Person(21,"aaradhya");

//        System.out.println(p1.age+p1.name);
//        System.out.println(p2.age+" "+p2.name);
       
        p2.walk( );
       // System.out.println(Person.count);
        Developer d1=new Developer(21,"chupchup");
        d1.walk();
    }
}
//class
class Person {
    //properties
    String name;
    int age;
    // default constructor
  /*  static int count=0;
    public Person(){
     count++;
        System.out.println("constructor create object");
    }  */
    // constructor overload
    public Person(int age,String name) {
        //calling construuctor
       // this();
       /* name=newname;
        age=newage; */
        // if arguments variable name are same as property name
        this.age=age;
        this.name=name;
    }

    //methods
    void walk(){
        System.out.println(name + " is walking");
    }
    void eat(){
        System.out.println(name + " is eating");
    }
    void walk(int steps){
        System.out.println(name +" walked" +steps);
    }
}
  class Developer extends Person{
    public Developer(int age,String name){
        super(age, name);

    }

  }

